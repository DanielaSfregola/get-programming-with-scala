package org.example.quiz

import cats.effect.{ExitCode, IO, IOApp}
import org.example.quiz.api.Api
import org.example.quiz.dao.Dao
import org.example.quiz.service.Services
import org.http4s.server.Router

import org.http4s.implicits._
import org.http4s.server.blaze.BlazeServerBuilder
import scala.concurrent.ExecutionContext

object QuizApp extends IOApp {

  private val dao = new Dao(TestDatabase.ctx)(ExecutionContext.global)
  private val services = new Services(dao)
  private val api = new Api(services)

  private val httpApp = Router(
    "/" -> api.generic.routes,
    "categories" -> api.category.routes,
    "quiz" -> api.quiz.routes
  ).orNotFound

  override def run(args: List[String]): IO[ExitCode] =
    stream(args).compile.drain.as(ExitCode.Success)

  private def stream(args: List[String]) =
    BlazeServerBuilder[IO](ExecutionContext.global)
    .bindHttp(8000, "0.0.0.0")
    .withHttpApp(httpApp)
    .serve


}

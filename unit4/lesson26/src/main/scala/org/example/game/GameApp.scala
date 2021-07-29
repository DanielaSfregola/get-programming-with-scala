package org.example.game

import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.implicits._
import org.http4s.server.Router
import org.http4s.blaze.server.BlazeServerBuilder

import scala.concurrent.ExecutionContext

object GameApp extends IOApp {

  private val httpApp = Router(
    "/" -> new GameApi().routes
  ).orNotFound

  override def run(args: List[String]): IO[ExitCode] =
    stream(args).compile.drain.as(ExitCode.Success)

  private def stream(args: List[String]) =
    BlazeServerBuilder[IO](ExecutionContext.global)
    .bindHttp(8080, "0.0.0.0")
    .withHttpApp(httpApp)
    .serve
}

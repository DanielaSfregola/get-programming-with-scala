package org.example.ping

import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.server.Router

import org.http4s.implicits._
import org.http4s.server.blaze.BlazeServerBuilder
import scala.concurrent.ExecutionContext

object PingApp extends IOApp {

  private val httpApp = Router(
    "/" -> new PingApi().routes
  ).orNotFound

  override def run(args: List[String]): IO[ExitCode] =
    stream(args).compile.drain.as(ExitCode.Success)

  private def stream(args: List[String]): fs2.Stream[IO, ExitCode] =
    BlazeServerBuilder[IO](ExecutionContext.global)
    .bindHttp(8000, "0.0.0.0")
    .withHttpApp(httpApp)
    .serve
}

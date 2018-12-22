package org.example.ping

import cats.effect.IO
import fs2.StreamApp
import org.http4s.server.blaze.BlazeBuilder

import scala.concurrent.ExecutionContext.Implicits.global

object PingApp extends StreamApp[IO] {

  def stream(args: List[String], requestShutdown: IO[Unit]) =
    BlazeBuilder[IO]
    .bindHttp(8000, "0.0.0.0")
    .mountService(pingService, "/")
    .serve

  private def pingService = (new PingService).service

}

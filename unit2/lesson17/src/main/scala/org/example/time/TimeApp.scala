package org.example.time

import cats.effect.IO
import fs2.StreamApp
import org.http4s.server.blaze.BlazeBuilder

import scala.concurrent.ExecutionContext.Implicits.global

object TimeApp extends StreamApp[IO] {

  def stream(args: List[String], requestShutdown: IO[Unit]) =
    BlazeBuilder[IO]
      .bindHttp(8080, "0.0.0.0")
      .mountService(timeService, "/")
      .serve

  def timeService = (new TimeService).service

}

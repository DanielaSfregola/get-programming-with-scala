package org.example.time

import java.time.format.DateTimeFormatter

import cats.effect.IO
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl

class TimeService extends Http4sDsl[IO] {

  private val printer = new TimePrinter(DateTimeFormatter.RFC_1123_DATE_TIME)

  val service = HttpService[IO] {
    case GET -> Root / "datetime" / country =>
      try {
        Ok(printer.now(country))
      } catch {
        case ex: IllegalStateException => NotFound(ex.getMessage)
      }
  }

}

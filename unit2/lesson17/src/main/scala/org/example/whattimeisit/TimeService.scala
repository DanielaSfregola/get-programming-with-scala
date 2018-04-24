package org.example.whattimeisit

import java.time.format.DateTimeFormatter

import cats.effect.IO
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl

class TimeService extends Http4sDsl[IO] {

  private val printer = new DateTimePrinter(DateTimeFormatter.RFC_1123_DATE_TIME)

  val service = HttpService[IO] {
    case GET -> Root / "datetime" / timezone =>
      try {
        Ok(printer.now(timezone))
      } catch {
        case ex: Throwable => NotFound(ex.getMessage)
      }
  }

}

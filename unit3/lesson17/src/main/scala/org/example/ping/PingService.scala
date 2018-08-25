package org.example.ping

import cats.effect.IO
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl

class PingService extends Http4sDsl[IO] {

  val service = HttpService[IO] {
    case GET -> Root / "ping" => Ok("pong")
  }

}

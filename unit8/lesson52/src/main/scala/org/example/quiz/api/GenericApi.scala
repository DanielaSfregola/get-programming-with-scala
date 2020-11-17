package org.example.quiz.api

import cats.effect.IO
import org.example.quiz.service.GenericService
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl

class GenericApi(genericService: GenericService) extends Http4sDsl[IO] {

  val routes = HttpRoutes.of[IO] {
    case GET -> Root / "ping" => Ok("pong")
    case GET -> Root / "healthCheck" => Ok(genericService.healthCheck)
  }

}

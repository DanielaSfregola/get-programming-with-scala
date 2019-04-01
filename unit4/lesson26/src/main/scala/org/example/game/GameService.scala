package org.example.game

import cats.effect.IO
import org.example.game.entities.Game
import org.http4s.HttpService
import org.http4s.dsl.Http4sDsl

class GameService extends Http4sDsl[IO] {

  val service = HttpService[IO] {
    case req @ POST -> Root / "play" =>
      for {
        text <- req.as[String]
        response <- Ok(Game(text).result)
      } yield response
  }

}

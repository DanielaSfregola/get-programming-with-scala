package org.example.quiz.api

import cats.effect.IO
import org.example.quiz.entities.CategoryEntity
import org.example.quiz.service.CategoryService
import org.http4s.HttpRoutes
import org.http4s.circe._
import org.http4s.dsl.Http4sDsl

class CategoryApi(categoryService: CategoryService)
  extends Http4sDsl[IO] {

  private implicit val categoriesEncoder =
    jsonEncoderOf[IO, List[CategoryEntity]]

  val routes = HttpRoutes.of[IO] {
    case GET -> Root => Ok(categoryService.all())
  }

}

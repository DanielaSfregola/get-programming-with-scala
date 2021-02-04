package org.example.quiz.api

import cats.effect.IO
import org.example.quiz.entities._
import org.example.quiz.service.QuizService
import org.http4s.HttpRoutes
import org.http4s.dsl._
import org.http4s.circe._

class QuizApi(quizService: QuizService) extends Http4sDsl[IO] {

  private implicit val quizEncoder = jsonEncoderOf[IO, QuizEntity]

  private implicit val givenAnswersDecoder =
    jsonOf[IO, List[GivenAnswerEntity]]
  private implicit val quizScoreEncoder =
    jsonEncoderOf[IO, ScoreEntity]

  private object CategoryParam extends QueryParamDecoderMatcher[Long]("category_id")

  val routes = HttpRoutes.of[IO] {
    case GET -> Root :? CategoryParam(categoryId) =>
      quizService.generate(categoryId).flatMap {
        case Some(quiz) => Ok(quiz)
        case None => NotFound(s"Category $categoryId does not exist")
      }
    case request @ POST -> Root =>
      val response = for {
        answers <- request.as[List[GivenAnswerEntity]]
        score <- quizService.score(answers)
      } yield score
      Ok(response)
  }

}

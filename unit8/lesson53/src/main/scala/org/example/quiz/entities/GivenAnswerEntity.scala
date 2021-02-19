package org.example.quiz.entities

import io.circe._
import io.circe.generic.semiauto._

case class GivenAnswerEntity(questionId: Long, answerId: Long)

object GivenAnswerEntity {

  implicit val encoder: Encoder[GivenAnswerEntity] =
    deriveEncoder[GivenAnswerEntity]
  implicit val decoder: Decoder[GivenAnswerEntity] =
    deriveDecoder[GivenAnswerEntity]
}

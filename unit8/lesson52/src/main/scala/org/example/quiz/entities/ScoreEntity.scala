package org.example.quiz.entities

import io.circe._
import io.circe.generic.semiauto._

case class ScoreEntity(score: Double,
                       correct: List[GivenAnswerEntity],
                       wrong: List[GivenAnswerEntity])

object ScoreEntity {

  implicit val encoder: Encoder[ScoreEntity] =
    deriveEncoder[ScoreEntity]
  implicit val decoder: Decoder[ScoreEntity] =
    deriveDecoder[ScoreEntity]

}

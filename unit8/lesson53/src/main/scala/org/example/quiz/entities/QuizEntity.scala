package org.example.quiz.entities

import io.circe._
import io.circe.generic.semiauto._
import org.example.quiz.dao.records.{Answer, Question}

case class QuizEntity(questions: List[QuestionEntity])

object QuizEntity {
  implicit val encoder: Encoder[QuizEntity] =
    deriveEncoder[QuizEntity]
  implicit val decoder: Decoder[QuizEntity] =
    deriveDecoder[QuizEntity]
}

case class QuestionEntity(id: Long,
                          text: String,
                          possibleAnswers: Set[PossibleAnswerEntity])

object QuestionEntity {

  implicit val encoder: Encoder[QuestionEntity] =
    deriveEncoder[QuestionEntity]
  implicit val decoder: Decoder[QuestionEntity] =
    deriveDecoder[QuestionEntity]

  def fromRecord(question: Question,
                 answers: Seq[Answer]): QuestionEntity = {
    val possibleAnswers = answers.map(PossibleAnswerEntity.fromRecord).toSet
    apply(question.id, question.text, possibleAnswers)
  }

}

case class PossibleAnswerEntity(id: Long, text: String)

object PossibleAnswerEntity {

  implicit val encoder: Encoder[PossibleAnswerEntity] =
    deriveEncoder[PossibleAnswerEntity]
  implicit val decoder: Decoder[PossibleAnswerEntity] =
    deriveDecoder[PossibleAnswerEntity]

  def fromRecord(answer: Answer): PossibleAnswerEntity =
    apply(answer.id, answer.text)
}

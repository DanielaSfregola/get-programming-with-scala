package org.example.quiz.service

import cats.effect.{ContextShift, IO}
import org.example.quiz.dao.QuestionAnswerDao
import org.example.quiz.entities._

class QuizService(dao: QuestionAnswerDao,
                  categoryService: CategoryService)
                 (implicit cs: ContextShift[IO]) {

  private val numberOfQuestions = 10

  def generate(categoryId: Long): IO[Option[QuizEntity]] =
    categoryService.get(categoryId).flatMap {
      case Some(category) =>
        pickQuestions(category, numberOfQuestions).map(qs =>
          Some(QuizEntity(qs)))
      case None => IO(None)
    }

  private def pickQuestions(category: CategoryEntity,
                            n: Int): IO[List[QuestionEntity]] = {
    val randomQAs = IO.fromFuture(IO(dao.pickByCategoryId(category.id, n = n)))
    randomQAs.map { qas =>
      qas.map { case (q, as) => QuestionEntity.fromRecord(q, as) }.toList
    }
  }

  def score(givenAnswers: List[GivenAnswerEntity]): IO[ScoreEntity] = {
    val questionIds = givenAnswers.map(_.questionId)
    IO.fromFuture(
      IO(dao.getCorrectQuestionAnswers(questionIds))).map { correctAnswers =>
      val goodAnswers = givenAnswers.filter { answer =>
        correctAnswers.exists { case (q, a) =>
          q == answer.questionId && a == answer.answerId
        }
      }
      val badAnswers = givenAnswers.diff(goodAnswers)
      val score = 1.0 * goodAnswers.size / givenAnswers.size
      ScoreEntity(score, correct = goodAnswers, wrong = badAnswers)
    }
  }
}

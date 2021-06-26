package org.example.quiz.dao

import io.getquill._
import org.example.quiz.dao.records.{Answer, Question}

import scala.concurrent.{ExecutionContext, Future}


class QuestionAnswerDao(ctx: PostgresJAsyncContext[SnakeCase.type])
                       (using ec: ExecutionContext) {

  import ctx._

  private inline def questions = quote { query[Question] }
  private inline def answers = quote { query[Answer] }

  def save(newQuestion: Question,
           newAnswers: Seq[Answer]): Future[(Long, Seq[Long])] =
      for {
        questionId <- saveQuestion(newQuestion)
        answerIds <- saveAnswers(questionId, newAnswers)
      } yield questionId -> answerIds

  private def saveQuestion(newQuestion: Question): Future[Long] = {
    inline def q = quote {
      questions.insert(lift(newQuestion)).returningGenerated(_.id)
    }
    run(q)
  }

  private def saveAnswers(questionId: Long, newAnswers: Seq[Answer]): Future[Seq[Long]] = {
    val updatedAnswers = newAnswers.map(_.copy(questionId = questionId))
    inline def q = quote {
      liftQuery(updatedAnswers).foreach { a =>
        answers.insert(a).returningGenerated(_.id)
      }
    }
    run(q)
  }

  def pickByCategoryId(categoryId: Long,
                       n: Int): Future[Map[Question, Seq[Answer]]] = {
    val result: Future[Seq[(Question, Answer)]] = run {
      for {
        question <- questions.filter(_.categoryId == lift(categoryId))
                             .sortBy(_ => infix"random()").take(lift(n))
        answer <- answers.filter(_.questionId == question.id)
      } yield question -> answer
    }

    result.map { questionsAndAnswers =>
      val questions: Seq[Question] =
        questionsAndAnswers.map { case (q, _) => q }.distinct
      val answersByQuestionId: Map[Long, Seq[Answer]] =
        questionsAndAnswers.map { case (_, a) => a }.groupBy(_.questionId)
      questions.map { question =>
        question -> answersByQuestionId.getOrElse(question.id, Seq.empty)
      }.toMap
    }
  }


  def deleteById(id: Long): Future[Boolean] = {
    inline def q = quote { questions.filter(_.id == lift(id) ).delete }
    run(q).map(_ > 0)
  }

  def getCorrectQuestionAnswers(questionIds: Seq[Long]): Future[Seq[(Long, Long)]] = {
    inline def q = quote {
      for {
        question <- questions.filter(q => lift(questionIds).contains(q.id))
        correctAnswer <- answers.filter(a => a.questionId == question.id && a.isCorrect)
      } yield question.id -> correctAnswer.id
    }
    run(q)
  }


}

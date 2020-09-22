package org.example.quiz.dao

import io.getquill.{SnakeCase, PostgresAsyncContext}
import org.example.quiz.dao.entities.{Answer, Question}

import scala.concurrent.{ExecutionContext, Future}


class QuestionAnswerDao(ctx: PostgresAsyncContext[SnakeCase.type])
                       (implicit ec: ExecutionContext) {

  import ctx._

  private val questions = quote { query[Question] }
  private val answers = quote { query[Answer] }

  def save(newQuestion: Question, newAnswers: List[Answer])
          (implicit ec: ExecutionContext): Future[(Long, List[Long])] = {
    val saveQuestion = quote {
      questions.insert(lift(newQuestion)).returningGenerated(_.id)
    }

    val saveAnswers = { questionId: Long =>
      val newAnswersWithQuestionId =
        newAnswers.map(_.copy(questionId = questionId))
      quote {
        liftQuery(newAnswersWithQuestionId).foreach { a =>
          answers.insert(a).returningGenerated(_.id)
        }
      }
    }

    transaction { implicit ec =>
      for {
        questionId <- run(saveQuestion)
        answerId <- run(saveAnswers(questionId))
      } yield questionId -> answerId
    }
  }

  def findByCategoryId(categoryId: Long)
                      (implicit ec: ExecutionContext): Future[Map[Question, List[Answer]]] = {
    val res: Future[List[(Question, Answer)]] = run {
      for {
        question <- questions.filter(_.categoryId == lift(categoryId))
        answer <- answers.filter(_.questionId == question.id)
      } yield question -> answer
    }

    res.map { questionsAndAnswers =>
      val questions: List[Question] =
        questionsAndAnswers.map { case (q, _) => q }.distinct
      val answersByQuestionId: Map[Long, List[Answer]] =
        questionsAndAnswers.map { case (_, a) => a }.groupBy(_.questionId)
      questions.map { question =>
        question -> answersByQuestionId.getOrElse(question.id, List.empty)
      }.toMap
    }
  }

  def deleteById(id: Long)
                (implicit ec: ExecutionContext): Future[Boolean] = {
    val q = quote { questions.filter(_.id == lift(id) ).delete }
    run(q).map(_ > 0)
  }


}

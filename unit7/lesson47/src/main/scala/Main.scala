import scala.concurrent.ExecutionContext.Implicits.global
import org.example.quiz._
import org.example.quiz.dao._
import org.example.quiz.dao.records._

import scala.concurrent.{Await, Future}
import scala.concurrent.duration._

object Main extends App {

    val genericDao = new GenericDao(TestDatabase.ctx)
    val categoryDao = new CategoryDao(TestDatabase.ctx)
    val qaDao = new QuestionAnswerDao(TestDatabase.ctx)

    printlnResult(genericDao.testConnection())

    val questionA = { (categoryId: Long) =>
        val question = Question(categoryId = categoryId, text = "Is this a test?")
        val answers = List(Answer(text = "True", isCorrect = true), Answer(text = "False"))
        qaDao.save(question, answers)
    }

    val questionB = { (categoryId: Long) =>
        val question = Question(categoryId = categoryId, text = "Another test?")
        val answers = List(Answer(text = "XXX"),
                           Answer(text = "YYY", isCorrect = true),
                           Answer(text = "ZZZ"))
        qaDao.save(question, answers)
    }

    printlnResult(for {
        categoryId <- categoryDao.save(Category(name = "Test"))
        _ <- Future.sequence(List(questionA(categoryId),
            questionB(categoryId)))
    } yield categoryId)

    printlnResult(categoryDao.all())
    printlnResult(qaDao.pickByCategoryId(1, n = 5))
    printlnResult(categoryDao.deleteById(1))
    printlnResult(qaDao.pickByCategoryId(1, n = 5))

    private def printlnResult[T](f: Future[T]) = {
        val t = Await.ready(f, atMost = 1.minute)
        println(t)
    }

}

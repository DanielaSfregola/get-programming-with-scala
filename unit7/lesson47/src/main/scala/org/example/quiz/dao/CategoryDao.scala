package org.example.quiz.dao

import io.getquill.{SnakeCase, PostgresAsyncContext}
import org.example.quiz.dao.entities.Category

import scala.concurrent.{ExecutionContext, Future}

class CategoryDao(ctx: PostgresAsyncContext[SnakeCase.type]) {
  import ctx._

  private val categories = quote { query[Category] }

  def save(category: Category)
          (implicit ec: ExecutionContext): Future[Long] = {
    val q = quote {
      categories.insert(lift(category)).returningGenerated(_.id)
    }
    run(q)
  }

  def all()(implicit ec: ExecutionContext): Future[List[Category]] =
    run(categories)

  def deleteById(id: Long)
                (implicit ec: ExecutionContext): Future[Boolean] = {
    val q = quote { categories.filter(_.id == lift(id)).delete }
    run(q).map(_ > 0)
  }

}

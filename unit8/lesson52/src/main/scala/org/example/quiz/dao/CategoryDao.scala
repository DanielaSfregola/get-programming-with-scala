package org.example.quiz.dao

import io.getquill.{SnakeCase, PostgresAsyncContext}
import org.example.quiz.dao.records.Category

import scala.concurrent.{ExecutionContext, Future}

class CategoryDao(ctx: PostgresAsyncContext[SnakeCase.type])
                 (implicit ec: ExecutionContext) {
  import ctx._

  private val categories = quote { query[Category] }

  def save(category: Category): Future[Long] = {
    val q = quote {
      categories.insert(lift(category)).returningGenerated(_.id)
    }
    run(q)
  }

  def all(): Future[List[Category]] = run(categories)

  def findById(id: Long): Future[Option[Category]] = {
    val q = quote { categories.filter(_.id == lift(id)) }
    run(q).map(_.headOption)
  }

  def deleteById(id: Long): Future[Boolean] = {
    val q = quote { categories.filter(_.id == lift(id)).delete }
    run(q).map(_ > 0)
  }

}

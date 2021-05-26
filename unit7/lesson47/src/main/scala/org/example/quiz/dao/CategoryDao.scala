package org.example.quiz.dao

import io.getquill.{SnakeCase, PostgresJAsyncContext}
import org.example.quiz.dao.records.Category

import scala.concurrent.{ExecutionContext, Future}

class CategoryDao(ctx: PostgresJAsyncContext[SnakeCase.type])(implicit ec: ExecutionContext) {
  import ctx._

  private val categories = quote { query[Category] }

  def save(category: Category): Future[Long] = {
    val q = quote {
      categories.insert(lift(category)).returningGenerated(_.id)
    }
    run(q)
  }

  def all(): Future[Seq[Category]] = run(categories)

  def deleteById(id: Long): Future[Boolean] = {
    val q = quote { categories.filter(_.id == lift(id)).delete }
    run(q).map(_ > 0)
  }

}

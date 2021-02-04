package org.example.quiz.stubs.dao

import org.example.quiz.dao.CategoryDao
import org.example.quiz.dao.records.Category

import scala.concurrent.{ExecutionContext, Future}

class FakeCategoryDao(implicit ec: ExecutionContext) extends CategoryDao(ctx = null /* unused */) {

  private var fakeCategories = Fixtures.categories

  override def save(category: Category): Future[Long] = {
    synchronized { fakeCategories = fakeCategories :+ category }
    Future(category.id)
  }

  override def all(): Future[List[Category]] = Future(fakeCategories)

  override def findById(id: Long): Future[Option[Category]] =
    Future(fakeCategories.find(_.id == id))

  override def deleteById(id: Long): Future[Boolean] = {
    val isPresent = fakeCategories.exists(_.id == id)
    synchronized { fakeCategories = fakeCategories.filterNot(_.id == id) }
    Future(isPresent)
  }

}

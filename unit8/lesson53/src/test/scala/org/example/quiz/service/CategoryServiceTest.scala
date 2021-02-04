package org.example.quiz.service

import cats.effect.IO
import org.example.quiz.entities.CategoryEntity
import org.example.quiz.stubs.dao.{FakeCategoryDao, Fixtures}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.concurrent.ExecutionContext

class CategoryServiceTest extends AnyFlatSpec with Matchers {

  private implicit val ec = ExecutionContext.global
  private implicit val cs = IO.contextShift(ec)

  val service = new CategoryService(new FakeCategoryDao)

  "CategoryService" should "return all the categories" in {
    val entities = service.all().unsafeRunSync()
    val expectedEntities = Fixtures.categories.map(CategoryEntity.fromRecord)
    entities.shouldEqual(expectedEntities)
  }

  it should "return a category if the id exists" in {
    val entity = CategoryEntity.fromRecord(Fixtures.catA)
    val optRes = service.get(entity.id).unsafeRunSync()
    optRes.shouldEqual(Some(entity))
  }

  it should "return no category if the id is invalid" in {
    val optRes = service.get(-1).unsafeRunSync()
    optRes.shouldEqual(None)
  }

}

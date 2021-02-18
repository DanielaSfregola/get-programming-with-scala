package org.example.quiz.service

import cats.effect.{ContextShift, IO}
import org.example.quiz.entities.CategoryEntity
import org.example.quiz.stubs.dao.{FakeCategoryDao, Fixtures}
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class CategoryServiceTest extends AsyncFlatSpec with Matchers {

  private implicit val cs: ContextShift[IO] = IO.contextShift(executionContext)

  private def mkService() = new CategoryService(new FakeCategoryDao)(cs)

  "CategoryService" should "return all the categories" in {
    val service = mkService()
    val entities = service.all().unsafeRunSync()
    val expectedEntities = Fixtures.categories.map(CategoryEntity.fromRecord)
    entities.shouldEqual(expectedEntities)
  }

  it should "return a category if the id exists" in {
    val service = mkService()
    val entity = CategoryEntity.fromRecord(Fixtures.catA)
    val optRes = service.get(entity.id).unsafeRunSync()
    optRes.shouldEqual(Some(entity))
  }

  it should "return no category if the id is invalid" in {
    val service = mkService()
    val optRes = service.get(-1).unsafeRunSync()
    optRes.shouldEqual(None)
  }

}

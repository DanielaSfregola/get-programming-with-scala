package org.example.quiz.service

import cats.effect.{ContextShift, IO}
import org.example.quiz.dao.CategoryDao
import org.example.quiz.dao.records.Category
import org.example.quiz.entities.CategoryEntity

class CategoryService(dao: CategoryDao)(implicit cs: ContextShift[IO]) {

  def get(id: Long): IO[Option[CategoryEntity]] =
    IO.fromFuture(IO(dao.findById(id))).map { maybeRecord =>
      maybeRecord.map(CategoryEntity.fromRecord)
    }

  def all(): IO[List[CategoryEntity]] =
    IO.fromFuture(IO(dao.all())).map { records =>
      records.map(CategoryEntity.fromRecord)
    }
}

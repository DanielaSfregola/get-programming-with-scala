package org.example.quiz.stubs.dao

import org.example.quiz.dao.records._

object Fixtures {

  val catA = Category(id = 1, name = "General")
  val catB = Category(id = 2, name = "History")

  val categories: List[Category] = List(catA, catB)

}

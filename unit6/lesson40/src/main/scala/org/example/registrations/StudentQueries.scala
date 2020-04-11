package org.example.registrations

import io.getquill.{PostgresJdbcContext, SnakeCase}

case class Student(id: Int, name: String)

class StudentQueries(ctx: PostgresJdbcContext[SnakeCase.type]) {
  import ctx._

  private val students = quote { query[Student] }

  def allStudents: List[Student] = {
    // Generated SQL: SELECT x.id, x.name FROM student x
    ctx.run(students)
  }

  def studentNameById(id: Int): List[String] = {
    // Generated SQL: SELECT x1.name FROM student x1 WHERE x1.id = ?
    val q = quote {
      students.filter(_.id == lift(id))
              .map(_.name)
    }
    ctx.run(q)
  }

  def save(student: Student): String = {
    // Generated SQL: INSERT INTO student (id,name) VALUES (?, ?) RETURNING name
    val q = quote {
      students.insert(lift(student))
              .returning(_.name)
    }
    ctx.run(q)
  }

  def updateNameById(id: Int, nameToUpdate: String): Long = {
    // Generated SQL: UPDATE student SET name = ? WHERE id = ?
    val q = quote {
      students.filter(_.id == lift(id))
              .update(_.name -> lift(nameToUpdate))
    }
    ctx.run(q)
  }

  def deleteStudentById(id: Int): Long = {
    // Generated SQL: DELETE FROM student WHERE id = ?
    val q = quote {
      students.filter(_.id == lift(id)).delete
    }
    ctx.run(q)
  }

}

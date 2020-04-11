// Add a function studentsByName to your class StudentQueries to generate and run
// a query to retrieve students with a given name.

// def studentsByName(name: String): List[Student] = ???



// ANSWER

import io.getquill.{PostgresJdbcContext, SnakeCase}

case class Student(id: Int, name: String)

class StudentQueries(ctx: PostgresJdbcContext[SnakeCase.type]) {
  import ctx._

  private val students = quote { query[Student] }

  def studentsByName(name: String): List[Student] = {
    val q = quote { students.filter(_.name == lift(name)) }
    ctx.run(q)
  }
}


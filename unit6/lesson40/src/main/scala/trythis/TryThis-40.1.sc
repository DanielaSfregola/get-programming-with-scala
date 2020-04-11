// The init.sql file you have downloaded for this lesson also creates two tables called
// exam_sessions and registrations with the following structure:

// CREATE TABLE IF NOT EXISTS exam_session (
// id INTEGER,
// title VARCHAR(45) NOT NULL,
// local_date DATE NOT NULL,
// PRIMARY KEY (id)
// );
//
// CREATE TABLE IF NOT EXISTS registration (
// student_id INTEGER,
// exam_session_id INTEGER,
// PRIMARY KEY (student_id, exam_session_id),
// FOREIGN KEY (student_id) REFERENCES exam_session(id),
// FOREIGN KEY (exam_session_id) REFERENCES student(id)
// );
//
// Define functions to create a session, select one by title, and register a student to it.


// ANSWERS

import java.time.LocalDate
import io.getquill.{PostgresJdbcContext, SnakeCase}

case class Student(id: Int, name: String)
case class ExamSession(id: Int, title: String, localDate: LocalDate)
case class Registration(studentId: Int, examSessionId: Int)

class ExamSessionQueries(ctx: PostgresJdbcContext[SnakeCase.type]) {
  import ctx._

  private val sessions = quote { query[ExamSession] }

  def createSession(session: ExamSession): Long = {
    val q = quote { sessions.insert(session) }
    ctx.run(q)
  }

  def sessionsByTitle(title: String): List[ExamSession] = {
    val q = quote { sessions.filter(_.title == lift(title)) }
    ctx.run(q)
  }

  def register(session: ExamSession, student: Student): Long = {
    val registration = Registration(studentId = student.id, examSessionId = session.id)
    val q = quote { query[Registration].insert(lift(registration)) }
    ctx.run(q)
  }
}

import java.time.LocalDate

import scala.util.{Failure, Success, Try}

case class Student(id: Int, name: String, topics: Set[String])
case class ExamSession(title: String, localDate: LocalDate, topic: String)

case class Registration(studentId: Int,
                        examSession: ExamSession,
                        localDate: LocalDate = LocalDate.now())

def toPrettyMsg(registration: Try[Registration]): String =
  registration match {
    case Success(reg) =>
      s"Student registered for exam session ${reg.examSession.title}"
    case Failure(ex) =>
      s"Registration failed: ${ex.getMessage}"
  }

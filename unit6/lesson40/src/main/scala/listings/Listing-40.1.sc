import java.time.LocalDate
import scala.util.{Failure, Success, Try}

case class Student(id: Int, name: String, topics: Set[String])
case class ExamSession(title: String, localDate: LocalDate, topic: String)

case class Registration(studentId: Int,
                        examSession: ExamSession,
                        localDate: LocalDate = LocalDate.now())

def register(student: Student,
             examSession: ExamSession): Try[Registration] = {
  if (student.topics.contains(examSession.topic))
    Success(Registration(student.id, examSession))
  else
    Failure(new IllegalStateException(
      s"Student ${student.id} is missing topic ${examSession.topic}"))
}

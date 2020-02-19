import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(topic: String, localDate: LocalDate)

def registrationsCountPerSession(
                                sessions: Map[ExamSession, List[Student]]): Map[ExamSession, Int] =
  sessions.map { case (examSession, students) =>
    examSession -> students.size
  }

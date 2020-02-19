import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(topic: String, localDate: LocalDate)

def filterByStudentId(sessions: Map[ExamSession, List[Student]], ids: List[Int]): Map[ExamSession, List[Student]] =
  sessions.flatMap { case (examSession, students) =>
    val matches = students.filter(student => ids.contains(student.id))
    if (matches.nonEmpty) List(examSession -> matches)
    else List.empty
  }

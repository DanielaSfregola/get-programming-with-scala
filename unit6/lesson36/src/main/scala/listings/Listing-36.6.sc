import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(topic: String, localDate: LocalDate)

def filterByStudentId(sessions: Map[ExamSession, List[Student]], ids: List[Int]): Map[ExamSession, List[Student]] =
  for {
    (examSession, students) <- sessions
    matches = students.filter(student => ids.contains(student.id))
    if matches.nonEmpty
  } yield examSession -> matches

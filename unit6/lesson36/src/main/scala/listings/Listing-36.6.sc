import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(topic: String, localDate: LocalDate)

def filterByStudentId(registrations: Map[ExamSession, List[Student]], ids: List[Int]): Map[ExamSession, List[Student]] =
  for {
    (examSession, students) <- registrations
    matches = students.filter(student => ids.contains(student.id))
    if matches.nonEmpty
  } yield examSession -> matches

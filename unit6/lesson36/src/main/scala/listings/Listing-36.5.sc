import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

def filterByStudentId(registrations: Map[ExamSession, List[Student]], ids: List[Int]): Map[ExamSession, List[Student]] =
  registrations.flatMap { case (examSession, students) =>
    val matches = students.filter(student => ids.contains(student.id))
    if (matches.nonEmpty) List(examSession -> matches)
    else List.empty
  }

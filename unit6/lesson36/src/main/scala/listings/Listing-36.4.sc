import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

def registrationsCountPerSession(
           registrations: Map[ExamSession, List[Student]]
      ): Map[ExamSession, Int] =
  registrations.map { case (examSession, students) =>
    examSession -> students.size
  }

import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

def getStudents(registrations: Map[ExamSession, List[Student]],
                session: ExamSession): List[Student] =
  registrations.getOrElse(session, List.empty)

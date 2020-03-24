import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

def merge(sessionA: Map[ExamSession, List[Student]],
          sessionB: Map[ExamSession, List[Student]]): Map[ExamSession, List[Student]] =
  sessionA ++ sessionB

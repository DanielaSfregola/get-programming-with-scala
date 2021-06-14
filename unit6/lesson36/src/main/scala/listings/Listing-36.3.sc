import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

def merge(
     regA: Map[ExamSession, List[Student]],
     regB: Map[ExamSession, List[Student]]
    ): Map[ExamSession, List[Student]] =
  regA ++ regB

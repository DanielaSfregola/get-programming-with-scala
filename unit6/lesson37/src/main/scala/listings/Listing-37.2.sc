import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

def getExamSessions(registrations: Map[ExamSession, List[Student]]): Iterable[ExamSession] =
  registrations.keys

def getStudents(registrations: Map[ExamSession, List[Student]]): Iterable[Student] =
  registrations.values.flatten

import java.time.LocalDate

case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

def totExamSessions(registrations: Map[ExamSession, List[Student]]): Int =
  registrations.size

def getExamSessions(registrations: Map[ExamSession, List[Student]],
                    date: LocalDate): Map[ExamSession, List[Student]] =
  registrations.filter { case (session, _) =>
    session.localDate == date
  }

def getStudents(
       registrations: Map[ExamSession, List[Student]]
    ): (ExamSession, List[Student]) =
  registrations.maxBy{ case (_, students) => students.size }

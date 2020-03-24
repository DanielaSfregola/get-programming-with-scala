import java.time.LocalDate

// Representing our data…
case class Student(id: Int, name: String)
case class ExamSession(title: String, localDate: LocalDate)

// Instances of ExamSession
val historySession = ExamSession(
  "History", localDate = LocalDate.now.plusDays(30))
val chemistrySession = ExamSession(
  "Chemistry", localDate = LocalDate.now.plusDays(45))

// Instances of Student
val jon = Student(id = 1, name = "Jon Snow")
val daenerys = Student(id = 2, name = "Daenerys Targaryen")
val arya = Student(id = 3, name = "Arya Stark")

val registrations: Map[ExamSession, List[Student]] = Map(
  historySession -> List(jon, daenerys),
  chemistrySession -> List(jon, arya)
)

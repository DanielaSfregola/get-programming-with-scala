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
val alice = Student(id = 1, name = "Alice Abbott")
val bob = Student(id = 2, name = "Bob Brown")
val charlie = Student(id = 3, name = "Charlie Clarke")

val registrations: Map[ExamSession, List[Student]] = Map(
  historySession -> List(alice, bob),
  chemistrySession -> List(alice, charlie)
)

val mathSession = ExamSession("Math", localDate = LocalDate.now)
registrations + (mathSession -> List(bob)) - chemistrySession

import java.time.LocalDate

import scala.util.{Failure, Success, Try}

case class Student(id: Int, name: String, topics: Set[String])
case class ExamSession(title: String, localDate: LocalDate, topic: String)

case class Registration(studentId: Int,
                        examSession: ExamSession,
                        localDate: LocalDate = LocalDate.now())

def getRegistrationDate(
       registration: Try[Registration]): Try[LocalDate] =
  registration.map(_.localDate)

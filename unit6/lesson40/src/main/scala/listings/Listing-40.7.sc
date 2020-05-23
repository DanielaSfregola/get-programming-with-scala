import java.time.LocalDate

import scala.util.{Failure, Success, Try}

case class Student(id: Int, name: String, topics: Set[String])
case class ExamSession(title: String, localDate: LocalDate, topic: String)

case class Registration(studentId: Int,
                        examSession: ExamSession,
                        localDate: LocalDate = LocalDate.now())

def register(student: Student, examSession: ExamSession): Try[Registration] = {
  if (student.topics.contains(examSession.topic))
    Success(Registration(student.id, examSession))
  else
    Failure(new IllegalStateException(
      s"Student ${student.id} is missing topic ${examSession.topic}"))
}

def toPrettyMsg(registration: Try[Registration]): String =
  registration match {
    case Success(reg) =>
      s"Student ${reg.studentId} is registered for exam session ${reg.examSession.title}"
    case Failure(ex) => s"Registration failed because ${ex.getMessage}"
  }

def getRegistrationDate(registration: Try[Registration]): Try[LocalDate] =
  registration.map(_.localDate)


val examSessionsPerTopic: Map[String, List[ExamSession]] = ???
def getNextExamSession(topic: String): Try[ExamSession] =
  examSessionsPerTopic.get(topic) match {
    case None => Failure(new IllegalArgumentException(s"No exam session found for topic $topic"))
    case Some(examSessions) =>
      val nextSession = examSessions.sortBy(_.localDate).find(_.localDate.isAfter(LocalDate.now()))
      nextSession.map(session => Success(session)).getOrElse(Failure(
        new IllegalStateException(s"There isn't a future session scheduled for topic $topic"))
  }

def registerForNextExamSession(student: Student, topic: String): Try[Try[Registration]] =
  getNextExamSession(topic).map { examSession =>
    register(student, examSession)
  }

def registerForNextExamSession2(student: Student, topic: String): Try[Registration] =
  getNextExamSession(topic).flatMap { examSession =>
    register(student, examSession)
  }

def registerForNextExamSession3(student: Student, topic: String): Try[Registration] =
  for {
    examSession <- getNextExamSession(topic)
    registration <- register(student, examSession)
  } yield registration

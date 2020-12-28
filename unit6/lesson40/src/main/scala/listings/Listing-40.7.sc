import java.time.LocalDate

import scala.util.Try

case class Student(id: Int, name: String, topics: Set[String])
case class ExamSession(title: String, localDate: LocalDate, topic: String)

case class Registration(studentId: Int,
                        examSession: ExamSession,
                        localDate: LocalDate = LocalDate.now())



def register(student: Student,
             examSession: ExamSession): Try[Registration] =
  Try {
    if (student.topics.contains(examSession.topic))
      Registration(student.id, examSession)
    else
      throw new IllegalStateException(
        s"Student ${student.id} is missing topic ${examSession.topic}")
  }

def getNextExamSession(topic: String): Try[ExamSession] = ???

def registerForNextExamSession(student: Student,
                               topic: String): Try[Registration] =
  getNextExamSession(topic).map { examSession =>
    register(student, examSession)
  }.flatten


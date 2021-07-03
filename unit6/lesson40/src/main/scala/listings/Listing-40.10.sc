import java.time.LocalDate

import scala.util.Try

case class ExamSession(title: String, localDate: LocalDate, topic: String)

def exists(nextSession: Try[ExamSession]): Boolean =
  nextSession.isSuccess

/*private*/ val defaultExamSession: ExamSession = ???
def getExamSession(nextSession: Try[ExamSession]): ExamSession =
  nextSession.getOrElse(defaultExamSession)

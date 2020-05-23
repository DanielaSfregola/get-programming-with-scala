// Rewrite the function findStudent(id: String) that you have implemented
// in quick check 40.5 using a for-comprehension statement.


// ANSWER

import scala.util._

case class Student(id: Int, name: String, topics: Set[String])
def findStudent(id: Int): Try[Student] = ???

def findStudent(id: String): Try[Student] =
  for {
    n <- Try(id.toInt)
    student <- findStudent(n)
  } yield student

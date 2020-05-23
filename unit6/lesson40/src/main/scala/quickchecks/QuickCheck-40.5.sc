// Imagine you have implemented a function to find a student by an id:

import scala.util._

case class Student(id: Int, name: String, topics: Set[String])
def findStudent(id: Int): Try[Student] = ???

// Implement another function called findStudent that takes a string as its parameter, and
// it returns an instance of Try[Student] by reusing the the existing findStudent(id: Int) function.

// def findStudent(id: String): Try[Student] = ???

// HINT: You can parse a string instance into an integer using the toInt function,
// which throws an exception if this is not possible.


// ANSWER

def findStudent(id: String): Try[Student] =
  Try(id.toInt).flatMap(findStudent)

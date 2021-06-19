// Imagine you are developing software to read and manipulate data from a file.
// Implement a function to parse a string into an instance of Person:

case class Person(age: Int, name: String)

// For example, the text "35, Jane Doe" should result in a Person instance equal
// to Person(35, "Jane Doe"). If your program cannot parse the given text,
// by returning an informative failure without throwing exceptions.
// HINT: You can use the method split to tokenize a string.

"a-b-c".split("-").toList
// val res0: List[String] = List(a, b, c)

"a-b-c".split("-", 2).toList // limiting to up to two tokens
// val res1: List[String] = List(a, b-c)


// ANSWER

import scala.util.Try

def parse(text: String): Try[Person] = Try {
  val List(age, name) = text.split(",", 2).toList
  Person(age.toInt, name)
}

parse("35, Jane Doe")
parse("invalid")

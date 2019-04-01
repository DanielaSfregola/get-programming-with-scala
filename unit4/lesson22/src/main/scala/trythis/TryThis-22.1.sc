// Define a case class Person to represent a person with a first name, an optional middle name,
// and a last name. Write a function that takes an instance of Person as its parameter,
// and it returns a string describing its full name. For example, when representing a person
// with first name George, middle name Watson and last name Lucas it should return the string
// “George Watson Lucas”. On the other hand, when representing a person with first name Martin,
// no middle name, and last name Odersky, it should return “Martin Odersky”.


case class Person(firstName: String, middleName: Option[String], lastName: String)

def fullName(person: Person): String =
  person match {
    case Person(fn, Some(mn), ln) => s"$fn $mn $ln"
    case Person(fn, None, ln) => s"$fn $ln"
  }

val george = Person(firstName = "George", middleName = Some("Watson"), lastName = "Lucas")
fullName(george)

val martin = Person(firstName = "Martin", middleName = None, lastName = "Odersky")
fullName(martin)

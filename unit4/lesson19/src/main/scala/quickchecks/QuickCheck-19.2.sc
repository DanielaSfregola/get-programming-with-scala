// Declare Person as a regular class rather than a case class by removing the keyword case for its implementation.
// What happens to the implementation of the function welcome?


// ANSWER
// The implementation of the function welcome no longer compiles.
// The compiler complains that it cannot find a value Person: a companion object with name Person
// and an implementation for the unapply function doesn’t exist because you have declared Person
// as a regular class rather than a case class.

//class Person(name: String, age: Int)
//
//def welcome(person: Person): String = person match {
//  case Person("Tom", _) => "Hello Mr Tom!"
//  case Person(name, age) if age > 18 => s"Good to see you $name"
//  case Person(_, _) => "Hi bro!"
//}

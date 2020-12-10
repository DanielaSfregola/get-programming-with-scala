// Define a function that takes a list of people and extract their names if they are
// 18 years old or more. Use the following case class to represent a person:

case class Person(name: String, age: Int)


// ANSWER

def adultNames(people: List[Person]): List[String] =
  for {
    person <- people
    if person.age >= 18
  } yield person.name

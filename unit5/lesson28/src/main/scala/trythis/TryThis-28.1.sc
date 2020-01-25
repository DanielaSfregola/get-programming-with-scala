// Define a function that takes a list of people and extract the name of those that are 18 or more.
// Use the following case class to represent a person:

case class Person(name: String, age: Int)


// ANSWER:

def adultNames(people: List[Person]): List[String] =
  for {
    person <- people
    if person.age >= 18
  } yield person.name

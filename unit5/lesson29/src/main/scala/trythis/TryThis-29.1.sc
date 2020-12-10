// Given a list of people, write a function to ensure an individual with a given name is in it.
// You should use the following case class to represent a person:


// ANSWER

case class Person(name: String, age: Int)

def exists(people: List[Person], name: String): Boolean =
  people.exists(_.name == name)
  // or if you want the name to be case insensitive:
  // people.exists(_.name.equalsIgnoreCase(name))


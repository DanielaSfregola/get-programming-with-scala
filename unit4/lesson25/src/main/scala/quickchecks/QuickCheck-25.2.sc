// Re-implement the unapply method for an instance of Person so that it is not possible
// to extract information when pattern matching on any person with the name “James Bond”.


case class Person(name: String, age: Int)

// ANSWER:

object Person {

  def unapply(p: Person): Option[(String, Int)] = {
    if (p.name.equalsIgnoreCase("James Bond")) None
    else Some((p.name, p.age))
  }
}

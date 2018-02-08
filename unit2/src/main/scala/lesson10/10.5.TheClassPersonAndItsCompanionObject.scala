package lesson10

// Listing 10.5
object TheClassPersonAndItsCompanionObject extends App {

  class Person(val name: String, val age: Int)

  object Person {

    def apply(p1: Person, p2: Person): Person = {
      val name = s"Son of ${p1.name} and ${p2.name}"
      val age = 0
      new Person(name, age)
    }

  }
}

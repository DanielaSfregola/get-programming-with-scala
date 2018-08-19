// In listing 11.5, you have added an apply method to create an instance of
// a person given two existing ones. Create new functions for the class Person to:
// - Determine the oldest between two people
// - Create a person by copying the parameters of an existing one

class Person(val name: String, val age: Int)

object Person {

  def apply(p1: Person, p2: Person): Person = { //#A
    val name = s"Son of ${p1.name} and ${p2.name}"
    val age = 0
    new Person(name, age)
  }

  def oldest(p1: Person, p2: Person): Person =
    if (p1.age > p2.age) p1 else p2

  def apply(p: Person): Person = new Person(p.name, p.age)
}

// Consider the following class Person:

case class Person(name: String, age: Int)

// Define a default implementation for Show[Person], so that your function prettyPrintln
// can print the name of the person, followed by its age. For example, the statement
// prettyPrintln(Person("Jon Doe", 25)) should print "Jon Doe (25)" to the console.


trait Show[T] {

  def show(t: T): String
}


// ANSWER

object Person {

  implicit val show: Show[Person] = new Show[Person] {
    override def show(p: Person): String = s"${p.name} (${p.age})"
  }

}

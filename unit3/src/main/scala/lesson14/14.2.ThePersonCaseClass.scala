package lesson14

// Listing 14.2
object ThePersonCaseClass extends App {

  case class Person(name: String) {

    def hi(): String = s"Hi, I am $name"

    def hello(n: String): String = s"Hello $n"

    def yo(n: String = "Bro") = s"Yo $n!"
  }
}


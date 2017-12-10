package lesson14

object `14.2.ThePersonCaseClass` {

  case class Person(name: String) {

    def hi(): String = s"Hi, I am $name"

    def hello(n: String): String = s"Hello $n"

    def yo(n: String = "Bro") = s"Yo $n!"
  }
}


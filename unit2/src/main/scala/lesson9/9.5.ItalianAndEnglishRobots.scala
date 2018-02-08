package lesson9

// Listing 9.5
object ItalianAndEnglishRobots extends App {

  class Robot(val name: String = "Unknown") { //#A
    def welcome(n: String) = "Welcome $n! My name is $name"
  }

  class ItalianRobot(name: String) extends Robot(name) { //#B

    override def welcome(n: String) =  //#E
      s"Benvenuto $n!"
  }

  class EnglishRobot(name: String, country: String) //#C
  extends Robot(name) { //#D

    override def welcome(n: String) =  //#E
    s"Welcome $n from the country of $country!"
  }
}

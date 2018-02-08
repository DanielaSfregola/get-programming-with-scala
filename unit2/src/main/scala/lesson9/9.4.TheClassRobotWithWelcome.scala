package lesson9

// Listing 9.4
object TheClassRobotWithWelcome extends App {

  class Robot(val name: String = "Unknown") {
    def welcome(n: String) = s"Welcome $n! My name is $name"
  }
}

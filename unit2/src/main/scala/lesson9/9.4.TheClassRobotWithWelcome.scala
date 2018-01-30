package lesson9

object `9.4.TheClassRobotWithWelcome` {

  class Robot(val name: String = "Unknown") {
    def welcome(n: String) = s"Welcome $n! My name is $name"
  }
}

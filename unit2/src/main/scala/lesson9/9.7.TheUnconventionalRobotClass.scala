package lesson9

// Listing 9.7
object TheUnconventionalRobotClass extends App {

  abstract class Robot(name: String) {

    def welcome(n: String): String
  }

  class UnconventionalRobot extends Robot(name = "Crazy Robot") {
    def welcome(n: String): String = "Yo Bro!"
  }

}

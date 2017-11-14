package lesson9

object `9.8.TheUnconventionalRobotClass` {

  abstract class Robot(name: String) {

    def welcome(n: String): String
  }

  class UnconventionalRobot extends Robot(name = "Crazy Robot") {
    def welcome(n: String): String = "Yo Bro!"
  }

}

package lesson9

object `9.9.CreatingAnUnconventionalRobot` {

  abstract class Robot(name: String) {
    def welcome(n: String): String
  }

  val crazyRobot = new Robot(name = "Crazy Robot") {
    def welcome(n: String): String = "Yo Bro!"
  }

}

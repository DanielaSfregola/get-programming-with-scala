package lesson9

// Listing 9.8
object CreatingAnUnconventionalRobot extends App {

  abstract class Robot(name: String) {
    def welcome(n: String): String
  }

  val crazyRobot = new Robot(name = "Crazy Robot") {
    def welcome(n: String): String = "Yo Bro!"
  }

}

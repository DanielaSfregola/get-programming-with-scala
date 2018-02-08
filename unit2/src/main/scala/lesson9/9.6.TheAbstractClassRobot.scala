package lesson9

// Listing 9.6
object TheAbstractClassRobot extends App {

  abstract class Robot(name: String) {

    def welcome(n: String): String
  }

}

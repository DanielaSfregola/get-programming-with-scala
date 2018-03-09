package lesson7

// Listing 7.6
object TheAbstractClassRobot extends App {

  abstract class Robot(name: String) {

    def welcome(n: String): String
  }

}

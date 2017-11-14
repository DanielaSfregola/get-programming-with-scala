package lesson9

object `9.6.ItalianAndEnglishRobots` {

  class Robot(name: String)

  class ItalianRobot(name: String) extends Robot(name) {

    def welcome(n: String) = s"Benvenuto $n!"
  }

  class EnglishRobot(name: String, country: String) extends Robot(name) {

    def welcome(n: String) = s"Welcome $n from the country of $country!"
  }

}

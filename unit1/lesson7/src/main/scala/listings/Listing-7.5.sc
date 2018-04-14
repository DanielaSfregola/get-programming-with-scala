class Robot(val name: String = "Unknown") {
    def welcome(n: String) = "Welcome $n! My name is $name"
}

class ItalianRobot(name: String) extends Robot(name) {

  override def welcome(n: String) =
    s"Benvenuto $n!"
}

class EnglishRobot(name: String, country: String)
extends Robot(name) {

  override def welcome(n: String) =
  s"Welcome $n from the country of $country!"
}

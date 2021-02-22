class Robot(val name: String = "Unknown") {
    def welcome(n: String) = s"Welcome $n! My name is $name"
}

class ItalianRobot(name: String) extends Robot(name) {

  override def welcome(n: String) =
    s"Benvenuto $n! Il mio nome e' $name"
}

class EnglishRobot(name: String, country: String) extends Robot(name) {

  override def welcome(n: String) =
    s"Welcome $n, I am $name from the country of $country!"
}

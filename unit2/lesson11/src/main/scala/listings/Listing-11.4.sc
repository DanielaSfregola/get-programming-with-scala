abstract class Robot(name: String) {

  def welcome: String
}

object Robot {

  def mostTalkative(r1: Robot, r2: Robot): Robot = {
    val r1Size = r1.welcome.length
    val r2Size = r2.welcome.length
    if (r1Size >= r2Size) r1 else r2
  }
}

object Vocabulary {

  val sentenceA = "Hi there!"
  val sentenceB = "Welcome!"
  val sentenceC = "Hello :)"

}

val tom = new Robot("Tom") {
  def welcome = Vocabulary.sentenceA
}

val alice = new Robot("Alice") {
  def welcome = Vocabulary.sentenceB
}

Robot.mostTalkative(tom, alice)

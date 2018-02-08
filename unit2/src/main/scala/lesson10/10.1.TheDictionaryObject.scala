package lesson10

object `10.1.TheDictionaryObject` extends App {

  object Dictionary extends App {

    val sentenceA = "Hi there!"
    def sentenceB(n: String) = s"Welcome $n!"
    val sentenceC = "What's up bro"

  }

  println(Dictionary.sentenceA)
  println(Dictionary.sentenceB("John"))

}

package lesson10

object `10.1.TheDictionaryObject` {

  object Dictionary extends App {

    val sentenceA = "Hi there!"
    def sentenceB(n: String) = s"Welcome $n!"
    val sentenceC = "What's up bro"

  }

  Dictionary.sentenceA
  Dictionary.sentenceB("John")

}

package lesson12

// Listing 12.5
object TuplesAndPatternMatching extends App {

  def hello(text: String, n: Int): String =
    (text, n) match {
      case ("Hello", i) => s"hi $i times"
      case (_, i) if i < 0 => "negative"
      case (_, 5) => "Hi five!"
      case (s, i) => s"Received $s and $i"
    }
}

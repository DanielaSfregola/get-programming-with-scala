package lesson12

object `12.5.TuplesAndPatternMatching` {

  def hello(text: String, n: Int): String =
    (text, n) match {
      case ("Hello", i) => s"hi $i times"
      case (_, i) if i < 0 => "negative"
      case (_, 5) => "Hi five!"
      case (s, i) => s"Received $s and $i"
    }
}

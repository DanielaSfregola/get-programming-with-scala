package lesson17

// Listing 17.1
object StatsOnString extends App {

  def size(s: String): Int  =
    s.length

  def countLetters(s: String): Int =
    s.count(_.isLetter)

  def countDigits(s: String): Int =
    s.count(_.isDigit)
}


package lesson17

// Listing 17.2
object AnotherStatsOnString extends App {

  def stats(s: String, predicate: Char => Boolean): Int =
    s.count(predicate)

  def size(s: String): Int  =
    stats(s, _ => true)

  def countLetters(s: String): Int =
    stats(s, _.isLetter)

  def countDigits(s: String): Int =
    stats(s, _.isDigit)
}


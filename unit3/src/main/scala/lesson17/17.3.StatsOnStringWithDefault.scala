package lesson17

// Listing 17.3
object StatsOnStringWithDefault extends App {

  def stats(s: String, predicate: Char => Boolean = { _ => true } ): Int =
    s.count(predicate)

  def size(s: String): Int  =
    stats(s)

  def countLetters(s: String): Int =
    stats(s, _.isLetter)

  def countDigits(s: String): Int =
    stats(s, _.isDigit)
}


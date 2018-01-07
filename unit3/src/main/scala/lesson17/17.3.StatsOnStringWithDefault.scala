package lesson17

object `17.3.StatsOnStringWithDefault` {

  def stats(s: String, predicate: Char => Boolean = { _ => true } ): Int =
    s.count(predicate)

  def size(s: String): Int  =
    stats(s)

  def countLetters(s: String): Int =
    stats(s, _.isLetter)

  def countDigits(s: String): Int =
    stats(s, _.isDigit)
}


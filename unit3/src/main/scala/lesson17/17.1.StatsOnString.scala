package lesson17

object `17.1.StatsOnString` {

  def size(s: String): Int  =
    s.length

  def countLetters(s: String): Int =
    s.count(_.isLetter)

  def countDigits(s: String): Int =
    s.count(_.isDigit)
}


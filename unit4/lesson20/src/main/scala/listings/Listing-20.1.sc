def size(s: String): Int  =
  s.length

def countLetters(s: String): Int =
  s.count(_.isLetter)

def countDigits(s: String): Int =
  s.count(_.isDigit)

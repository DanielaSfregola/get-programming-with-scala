def stats(s: String, predicate: Char => Boolean): Int =
  s.count(predicate)


def size(s: String): Int  = stats(s, _ => true)

def countLetters(s: String): Int = stats(s, _.isLetter)

def countDigits(s: String): Int = stats(s, _.isDigit)

val text = "This is my Text Example"
stats(text, _.isUpper)
stats(text, _ == 'x')

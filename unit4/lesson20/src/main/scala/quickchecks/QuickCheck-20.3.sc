// Change the code shown in listing 21.4 to add a new type of statics to count the whitespaces
// in a string: use the function isWhitespace defined in the class Char.


// ANSWER

sealed trait Mode
case object Length extends Mode
case object Letters extends Mode
case object Digits extends Mode
case object Whitespaces extends Mode


def predicateSelector(mode: Mode): Char => Boolean =
  mode match {
    case Length => _ => true
    case Letters => _.isLetter
    case Digits => _.isDigit
    case Whitespaces => _.isWhitespace
  }

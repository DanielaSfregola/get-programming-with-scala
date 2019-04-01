sealed trait Mode
case object Length extends Mode
case object Letters extends Mode
case object Digits extends Mode

def predicateSelector(mode: Mode): Char => Boolean =
  mode match {
    case Length => _ => true
    case Letters => _.isLetter
    case Digits => _.isDigit
  }

def stats(s: String,
          predicate: Char => Boolean = { _ => true } ): Int =
  s.count(predicate)

val text = "This is my Text Example"
stats(text, predicateSelector(Length))
stats(text, predicateSelector(Letters))


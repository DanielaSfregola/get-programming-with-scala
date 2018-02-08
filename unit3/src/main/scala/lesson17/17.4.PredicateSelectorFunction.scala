package lesson17

// Listing 17.4
object PredicateSelectorFunction extends App {

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

}


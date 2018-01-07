package lesson17

object `17.4.PredicateSelectorFunction` {

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


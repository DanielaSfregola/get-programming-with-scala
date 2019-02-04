package org.example.game.entities

sealed trait Symbol {

  protected def beats: List[Symbol]

  def wins(other: Symbol): Boolean =
    beats.contains(other)

}

object Symbol {

  def fromString(text: String): Symbol =
    text.trim.toLowerCase match {
      case "rock" => Rock
      case "paper" => Paper
      case "scissors" => Scissors
      case "lizard" => Lizard
      case "spock" => Spock
      case unknown =>
        val errorMsg = s"Unknown symbol $unknown. " +
         "Please pick a valid symbol [Rock, Paper, Scissors, Lizard, Spock]"
        throw new IllegalArgumentException(errorMsg)
    }

}

/**
  * Rock crushes Lizard
  * Rock crushes Scissors.
  */
case object Rock extends Symbol {
  protected val beats = List(Lizard, Scissors)
}

/**
  * Paper covers Rock
  * Paper disproves Spock
  */
case object Paper extends Symbol {
  protected val beats = List(Rock, Spock)
}

/**
  * Scissors cuts Paper
  * Scissors decapitates Lizard
  */
case object Scissors extends Symbol {
  protected val beats = List(Paper, Lizard)
}

/**
  * Lizard poisons Spock
  * Lizard eats Paper
  */
case object Lizard extends Symbol {
  protected val beats = List(Spock, Paper)
}

/**
  * Spock smashes Scissors
  * Spock vaporizes Rock
  */
case object Spock extends Symbol {
  protected val beats = List(Scissors, Rock)
}


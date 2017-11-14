package lesson13

sealed trait Symbol {
  protected def beats: List[Symbol]

 def wins(other: Symbol): Boolean =
  beats.contains(other)

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

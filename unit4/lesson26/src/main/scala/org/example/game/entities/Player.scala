package org.example.game.entities

class Player(name: String, val symbol: Symbol) {

  override def toString: String = s"Player $name with symbol $symbol"
}

object Player {

  // valid example: "Daniela: Spock"
  def apply(text: String): Player =
    text.split(":", 2) match {
      case Array(name, symbol) =>
        new Player(name.trim, Symbol.fromString(symbol))
      case _ =>
        val errorMsg = s"Invalid player $text. " +
          "Please, use the format <name>: <symbol>"
        throw new IllegalArgumentException(errorMsg)
    }

  def unapply(player: Player): Option[Symbol] = Some(player.symbol)

}

package org.example.game.entities

case class Game(playerA: Player, playerB: Player) {

  private val winner: Option[Player] =
    (playerA, playerB) match {
      case (pA @ Player(sA), Player(sB)) if sA.wins(sB) => Some(pA)
      case (Player(sA), pB @ Player(sB)) if sB.wins(sA) => Some(pB)
      case _ => None // it's a draw!
    }

  val result: String = winner.map(player => s"$player wins!")
                             .getOrElse("It's a draw!")

}

object Game {

  // valid example: "Daniela: Spock - Martin: Paper"
  def apply(text: String): Game =
    text.split("-", 2) match {
      case Array(playerA, playerB) => apply(Player(playerA), Player(playerB))
      case _ =>
        val errorMsg = s"Invalid game $text. " +
         s"Please, use the format <name>: <symbol> - <name>: <symbol>"
        throw new IllegalArgumentException(errorMsg)
    }
}

package lesson13

case class Game(playerA: String, playerB: String) {

  def round(sA: Symbol, sB: Symbol): String =
    if (sA == sB) "It's a tie!"
    else if (sA.wins(sB)) s"$sA beats $sB: PlayerA $playerA wins!"
    else s"$sB beats $sA: PlayerB $playerB wins!"
}

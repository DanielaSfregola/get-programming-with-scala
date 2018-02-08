package lesson13

object GameExample extends App {

  val game = Game(playerA = "Sheldon", playerB = "Leonard")
  println(game.round(Spock, Spock))
  println(game.round(Spock, Paper))
  println(game.round(Rock, Scissors))

}

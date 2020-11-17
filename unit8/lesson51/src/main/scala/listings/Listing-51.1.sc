import scala.util.Random
import cats.effect.IO

def rollDice: IO[Int] = IO(Random.nextInt(6) + 1)

def rollOutcome: IO[String] = rollDice.map(n => s"Rolled $n!")

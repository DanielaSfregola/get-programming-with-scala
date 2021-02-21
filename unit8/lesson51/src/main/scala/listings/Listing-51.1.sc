import scala.util.Random
import cats.effect.IO

def rollDie: IO[Int] = IO(Random.nextInt(6) + 1)

def rollOutcome: IO[String] = rollDie.map(n => s"Rolled $n!")

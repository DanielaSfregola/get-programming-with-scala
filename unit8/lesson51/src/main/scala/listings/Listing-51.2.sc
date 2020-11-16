import cats.effect.IO
import scala.util.Random

def rollDice: IO[Int] = IO(Random.nextInt(6) + 1)

def rollDiceTwice: IO[Int] = rollDice.flatMap { n1 =>
  rollDice.map(n2 => n1 + n2)
}


import cats.effect.IO
import scala.util.Random

def rollDice: IO[Int] = IO(Random.nextInt(6) + 1)

def rollDiceTwice: IO[Int] =
  for {
    n1 <- rollDice
    n2 <- rollDice
  } yield n1 + n2


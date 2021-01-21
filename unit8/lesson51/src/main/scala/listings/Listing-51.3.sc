import cats.effect.IO
import scala.util.Random

def rollDie: IO[Int] = IO(Random.nextInt(6) + 1)

def rollDieTwice: IO[Int] =
  for {
    n1 <- rollDie
    n2 <- rollDie
  } yield n1 + n2


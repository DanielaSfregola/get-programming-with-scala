import cats.effect.IO
import scala.util.Random

def rollDie: IO[Int] = IO(Random.nextInt(6) + 1)

def rollDieTwice: IO[Int] = rollDie.flatMap { n1 =>
  rollDie.map(n2 => n1 + n2)
}


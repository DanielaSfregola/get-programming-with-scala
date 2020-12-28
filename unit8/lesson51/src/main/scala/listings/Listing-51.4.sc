import cats.effect.{ContextShift, IO}
import cats.syntax.parallel._

import scala.util.Random

def rollDice(n: Int): IO[Int] = IO {
  println(s"Rolling $n-side dice...")
  Random.nextInt(n) + 1
}

def rollDice(using cs: ContextShift[IO]): IO[List[Int]] = {
  List(rollDice(6), rollDice(8), rollDice(12), rollDice(20)).parSequence
}



import scala.concurrent.ExecutionContext
given cs: ContextShift[IO] = IO.contextShift(ExecutionContext.global)

rollDice.unsafeRunSync()

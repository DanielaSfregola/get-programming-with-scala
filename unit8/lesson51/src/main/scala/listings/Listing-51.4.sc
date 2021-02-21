import cats.effect.{ContextShift, IO}
import cats.syntax.parallel._

import scala.util.Random

def rollDie(n: Int): IO[Int] = IO {
  println(s"Rolling $n-side die...")
  Random.nextInt(n) + 1
}

def rollDice(using cs: ContextShift[IO]): IO[List[Int]] = {
  List(rollDie(6), rollDie(8), rollDie(12), rollDie(20)).parSequence
}



import scala.concurrent.ExecutionContext
given cs: ContextShift[IO] = IO.contextShift(ExecutionContext.global)

rollDice.unsafeRunSync()

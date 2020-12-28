// Implement a function called selectionAverage to pick 100 random integers and compute their average:

// import cats.effect.{ContextShift, IO}
// def selectionAverage(using cs: ContextShift[IO]): IO[Double]

// Use the given value randomNumber to pick one random number between one and ten,
// and perform the number selection in parallel.

// import cats.effect.IO
// import scala.util.Random

// val randomNumber: IO[Int] = IO(Random.nextInt(10) + 1)

// HINT: The statement (0 to 99).toList returns a sequence of size 100 containing
// all the numbers from 0 to 99 inclusive.


// ANSWER

import cats.effect.{ContextShift, IO}
import cats.syntax.parallel._

import scala.util.Random

val randomNumber: IO[Int] = IO(Random.nextInt(10) + 1)

def selectionAverage(using cs: ContextShift[IO]): IO[Double] =
  (0 to 49).toList.map(_ => randomNumber).parSequence.map { numbers =>
    1.0 * numbers.sum / numbers.size
  }



import scala.concurrent.ExecutionContext
given cs: ContextShift[IO] = IO.contextShift(ExecutionContext.global)

selectionAverage.unsafeRunSync()

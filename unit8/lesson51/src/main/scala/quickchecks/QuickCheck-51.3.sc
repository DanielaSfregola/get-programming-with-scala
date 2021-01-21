// In Quick Check 51.2, you have implemented a function called printRollOutcome:
// refactor it to use a for-comprehension statement.



// ANSWER

import cats.effect.IO

import scala.util.Random

def rollDie: IO[Int] = IO(Random.nextInt(6) + 1)

def rollOutcome: IO[String] = rollDie.map(n => s"Rolled $n!")

def printToConsole(msg: String): IO[Unit] = IO(println(msg))

def printRollOutcome: IO[Unit] =
  for {
    n <- rollOutcome
    res <- printToConsole(n)
  } yield res

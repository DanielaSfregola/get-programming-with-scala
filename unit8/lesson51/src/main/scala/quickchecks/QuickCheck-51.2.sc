// Consider the following function to print a message to the console:

// import cats.effect.IO

// def printToConsole(msg: String): IO[Unit] = IO(println(msg))

// Implement a function called printRollOutcome to print the outcome of a roll to the console
// by composing the printToConsole method with rollOutcome from listing 51.1.



// ANSWER

import scala.util.Random
import cats.effect.IO

def rollDie: IO[Int] = IO(Random.nextInt(6) + 1)

def rollOutcome: IO[String] = rollDie.map(n => s"Rolled $n!")

def printToConsole(msg: String): IO[Unit] = IO(println(msg))

def printRollOutcome: IO[Unit] = rollOutcome.flatMap(printToConsole)

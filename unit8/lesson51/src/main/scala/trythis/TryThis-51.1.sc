// Using the type IO, define a small program that prints a message for the name of the user,
// reads it from the console, and displays a personalized greeting message in return.


// ANSWER

import cats.effect.IO

def printText(msg: String): IO[Unit] = IO(println(msg))
val readText: IO[String] = IO(scala.io.StdIn.readLine())

val greetings: IO[Unit] = for {
  _ <- printText("What is your name?")
  name <- readText
  _ <- printText(s"Hello $name!")
} yield ()


greetings.unsafeRunSync()

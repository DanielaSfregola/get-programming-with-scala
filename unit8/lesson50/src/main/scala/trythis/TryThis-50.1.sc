// Consider the following snippet of code that prints the list of files in the current directory:

import java.io.File

import scala.util.Try
new File(".").listFiles().foreach(println)

// In lesson 43, you have used Future to execute this operation asynchronously:
// implement it using IO instead.


// ANSWER

import cats.effect.IO

val printAllFiles = IO.async { callback =>
  val result = Try {
    new File(".").listFiles().foreach(println)
  }.toEither
  callback(result)
}

printAllFiles.unsafeRunAsyncAndForget()


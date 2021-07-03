// Implement a function called toTry that converts an instance of Either[Throwable, T]
// into one of type Try[T].

// def toTry[T](either: Either[Throwable, T]): Try[T]


// ANSWER

import scala.util._

def toTry[T](either: Either[Throwable, T]): Try[T] =
  either match {
    case Left(ex) => Failure(ex)
    case Right(t) => Success(t)
  }




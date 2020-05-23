// Implement a function called toEither that converts an instance of Try[T]
// into one of type Either[Throwable, T].

// def toEither[T](tryT: Try[T]): Either[Throwable, T] = ???


// ANSWER

import scala.util._

def toEither[T](tryT: Try[T]): Either[Throwable, T] =
  tryT match {
    case Success(t) => Right(t)
    case Failure(ex) => Left(ex)
  }




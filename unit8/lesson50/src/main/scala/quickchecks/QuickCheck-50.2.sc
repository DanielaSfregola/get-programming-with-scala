// Implement a function convertToIO to convert a Future instance into one of type IO using
// the IO.async function.


// ANSWER

import cats.effect.IO

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

def convertToIO[T](future: => Future[T])
                  (using ec: ExecutionContext): IO[T] =
  IO.async { callback =>
      future.onComplete {
        case Success(t) => callback(Right(t))
        case Failure(ex) => callback(Left(ex))
      }
  }

// Note that the function passes the parameter future by name as you need to ensure
// your program executes it after receiving the callback, not before.

// Consider the following function: does it compile? What output does it produce when invoked?

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

def isSuccess[T](f: Future[T]): Unit = f.onComplete(_.isSuccess)


// ANSWER

// The function isSuccess compiles, but it returns no value: when your Future instance completes,
// the callback produces a boolean value that the method onComplete then discards.


// scala> import scala.concurrent.ExecutionContext.Implicits.global
//      | import scala.concurrent.Future
//      |
//      | def isSuccess[T](f: Future[T]): Unit = f.onComplete(_.isSuccess)
// import scala.concurrent.ExecutionContext.Implicits.global
// import scala.concurrent.Future
// isSuccess: [T](f: scala.concurrent.Future[T])Unit
//
// scala> isSuccess(Future("hello"))
//
// scala> isSuccess(Future(throw new Exception("BOOM!")))

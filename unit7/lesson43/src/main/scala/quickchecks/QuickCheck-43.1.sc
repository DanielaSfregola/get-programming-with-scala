// Consider the following function: does it compile? What output does it produce when invoked?

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def test(): Unit = {
  Future(('a' to 'c').map(print))
  (0 to 2).map(print)
}


// ANSWER

// The function compiles: an instance of ExecutionContext.global is available through the import
// of scala.concurrent.ExecutionContext.Implicits.global. Its output is non-deterministic:
// it changes based on when how the executor schedules its threads.
//
// scala> :paste
// // Entering paste mode (ctrl-D to finish)
//
// import scala.concurrent.Future
// import scala.concurrent.ExecutionContext.Implicits.global
//
// def test(): Unit = {
//   Future(('a' to 'c').map(print))
//   (0 to 2).map(print)
// }
//
// // Exiting paste mode, now interpreting.
//
// import scala.concurrent.Future
// import scala.concurrent.ExecutionContext.Implicits.global
// test: ()Unit
//
// scala> test()
// abc012
// scala> test()
// 0abc12
// scala> test()
// 012abc

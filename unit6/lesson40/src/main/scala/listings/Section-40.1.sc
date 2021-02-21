import scala.util._
// Adding Try, Success, Failure to your scope

val a: Try[Int] = Success(1)
// a: scala.util.Try[Int] = Success(1)

val b1: Try[Int] = Success("scala")
// <console>:14: error: type mismatch;
//  found   : String("scala")
//  required: Int
//  val b1: Try[Int] = Success("scala")
// Success must contain an integer!

val b2: Try[Int] = Failure(new Exception("error!"))
// b2: scala.util.Try[Int] = Failure(java.lang.Exception: error!)

val b3: Try[Int] = Failure("error!")
// <console>:14: error: type mismatch;
//  found   : String("error!")
//  required: Throwable
//  val b3: Try[Int] = Failure("error!")
// String does not implement Throwable!


val b4: Try[Int] = Try(10/2)
// b4: scala.util.Try[Int] = Success(5)
// equivalent to Try.apply(10/2)

val b5: Try[Int] = Try(10/0)
// b5: scala.util.Try[Int] = Failure(java.lang.ArithmeticException: / by zero)
// The expression 10/0 throws an ArithmeticException instance

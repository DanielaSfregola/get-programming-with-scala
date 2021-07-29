import scala.concurrent.Future

Future(10/2)
// <console>:13: error: Cannot find an implicit ExecutionContext. You might pass
// an (using ec: ExecutionContext) parameter to your method
// or import scala.concurrent.ExecutionContext.Implicits.global.
// Future(10/2)
// ^
// you need to provide an ExecutionContext to Future.apply!

import scala.concurrent.ExecutionContext.Implicits.global

Future(10/2)
// val res0: scala.concurrent.Future[Int] = Future(Success(5))
// Its execution has completed with success
// before the REPL displays its content

val tenOverZero = Future(10/0)
// val res1: scala.concurrent.Future[Int] = Future(<not completed>)
// This time, its execution has not completed yet

tenOverZero
// val tenOverZero: scala.concurrent.Future[Int] = Future(Failure(java.lang.ArithmeticException: / by zero))
// Checking its content again after some time,
// it has completed with a failure

val foo = {
 println("Hello")
 Future(println("World"))
 println("!")
}
//  Hello
//  !
//  World

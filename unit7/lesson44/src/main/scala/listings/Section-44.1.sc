import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

Future(12/2).map(_ * 3)
// res0: scala.concurrent.Future[Int] = Future(Success(18))

Future(12/0).map(_ * 3)
// res1: scala.concurrent.Future[Int] = Future(Failure(java.lang.ArithmeticException: / by zero))

Future(12/2).map { n =>
 if (n > 10) n
 else throw new Exception(s"Too small: $n")
}
// res2: scala.concurrent.Future[Int] = Future(Failure(
// java.lang.Exception: Too small: 6))



val twelveOverZero = Future(Future(12/0)).flatten
// twelveOverZero: scala.concurrent.Future[Int] = Future(<not completed>)

twelveOverZero
// twelveOverZero: scala.concurrent.Future[Int] = Future(Failure(java.lang.ArithmeticException: / by zero))

Future(Future(12/2)).flatten
// res2: scala.concurrent.Future[Int] = Future(Success(6))

Future(5).flatten
// <console>:14: error: Cannot prove that Int <:< scala.concurrent.Future[S].
//  Future(5).flatten
//  ^
// you can only invoke the method flatten on nested structured


val twelveOverTwo = Future(12/2).flatMap(n => Future(n.toString))
// twelveOverTwo : scala.concurrent.Future[String] = Future(<not completed>)
// twelveOverTwo has not completed yet – let give it another try

twelveOverTwo
// twelveOverTwo: scala.concurrent.Future[String] = Future(Success(6))
// twelveOverTwo has now completed successfully

Future(12/0).flatMap(n => Future(n.toString))
// res0: scala.concurrent.Future[String] = Future(Failure(java.lang.ArithmeticException: / by zero))

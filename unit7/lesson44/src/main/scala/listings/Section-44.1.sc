import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

Future(12/2).map(_ * 3)
// val res0: scala.concurrent.Future[Int] = Future(Success(18))

Future(12/0).map(_ * 3)
// val res1: scala.concurrent.Future[Int] = Future(Failure(java.lang.ArithmeticException: / by zero))

Future(12/2).map { n =>
 if (n > 10) n
 else throw new Exception(s"Too small: $n")
}
// val res2: scala.concurrent.Future[Int] = Future(Failure(
// java.lang.Exception: Too small: 6))



val twelveOverZero = Future(Future(12/0)).flatten
// val twelveOverZero: scala.concurrent.Future[Int] = Future(<not completed>)

twelveOverZero
// val twelveOverZero: scala.concurrent.Future[Int] = Future(Failure(java.lang.ArithmeticException: / by zero))

Future(Future(12/2)).flatten
// val res3: scala.concurrent.Future[Int] = Future(Success(6))

Future(5).flatten
//  error: Cannot prove that Int <:< scala.concurrent.Future[S].
// you can only invoke the method flatten on nested structured


val twelveOverTwo = Future(12/2).flatMap(n => Future(n.toString))
// val twelveOverTwo : scala.concurrent.Future[String] = Future(<not completed>)
// twelveOverTwo has not completed yet – let give it another try

twelveOverTwo
// val twelveOverTwo: scala.concurrent.Future[String] = Future(Success(6))
// twelveOverTwo has now completed successfully

Future(12/0).flatMap(n => Future(n.toString))
// val res0: scala.concurrent.Future[String] = Future(Failure(java.lang.ArithmeticException: / by zero))

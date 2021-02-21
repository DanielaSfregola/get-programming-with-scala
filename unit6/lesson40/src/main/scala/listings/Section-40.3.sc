import scala.util._

Try(5).map(_ + 1.23)
// res0: scala.util.Try[Double] = Success(6.23)

Try(5/0).map(_ + 1.23)
// res1: scala.util.Try[Double] = Failure(java.lang.ArithmeticException: / by zero)


Try(Try(1)).flatten
// res0: scala.util.Try[Int] = Success(1)

Try(Try(1/0)).flatten
// res1: scala.util.Try[Int] = Failure(java.lang.ArithmeticException: / by zero)

Try(1).flatten
// <console>:15: error: Cannot prove that Int <:< scala.util.Try[U].
//  Try(1).flatten
// You can invoke the function flatten only on nested structures


Try(1).flatMap(n => Try(2/n))
// res0: scala.util.Try[Int] = Success(2)

Try(0).flatMap(n => Try(2/n))
// res1: scala.util.Try[Int] = Failure(java.lang.ArithmeticException: / by zero)

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def futureA = Future { Thread.sleep(42); 42 }
// futureA: scala.concurrent.Future[Int]

def futureB = Future(123/0)
// futureB: scala.concurrent.Future[Int]

Future.firstCompletedOf(Seq(futureA, futureB))
// res0: scala.concurrent.Future[Int] = Future(Failure(java.lang.ArithmeticException: / by zero))


val seqAB = Future.find(Seq(futureA, futureB))(_ > 10)
// seqAB: scala.concurrent.Future[Option[Int]] = Future(<not completed>)

seqAB
// seqAB: scala.concurrent.Future[Option[Int]] = Future(Success(Some(42)))

Future.find(Seq(futureA, futureB))(_ > 100)
// res0: scala.concurrent.Future[Option[Int]] = Future(Success(None))
// No Future instance in the sequence produces a value bigger than 100!

def futureC = Future(123)
// futureC: scala.concurrent.Future[Int]

Future.sequence(Seq(futureA, futureB, futureC))
// res0: scala.concurrent.Future[Seq[Int]] = Future(Failure(java.lang.ArithmeticException: / by zero))

val seqAC = Future.sequence(Seq(futureA, futureC))
// seqAC: scala.concurrent.Future[Seq[Int]] = Future(<not completed>)

seqAC
// seqAC: scala.concurrent.Future[Seq[Int]] = Future(Success(List(42, 123)))

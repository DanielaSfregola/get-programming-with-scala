import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

Future(12/2).flatMap(n => Future(n.toString))
// val res0: scala.concurrent.Future[String] = Future(Success(6))

for {
  n <- Future(12/2)
  res <- Future(n.toString)
} yield res
// val res1: scala.concurrent.Future[String] = Future(Success(6))

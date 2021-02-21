import scala.concurrent.{ExecutionContext, Future}

def fooA(using ec: ExecutionContext): Future[Int] = {
  def future = Future { println("Scala"); 5 }
  for {
    a <- future
    b <- future
  } yield a + b
}

def fooB(using ec: ExecutionContext): Future[Int] = {
  val future = Future { println("Scala"); 5 }
  for {
    a <- future
    b <- future
  } yield a + b
}


import scala.concurrent.ExecutionContext.Implicits.global
fooA
// Scala
// Scala
//res0: Int = 10

fooB
// Scala
//res1: Int = 10




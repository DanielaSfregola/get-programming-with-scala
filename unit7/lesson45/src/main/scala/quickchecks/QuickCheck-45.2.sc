// Consider the following snippet of code: improve the execution time of the function myOp
// by running asynchronous operations in parallel where possible.


import scala.concurrent.{ExecutionContext, Future}

def opA(a: String)(using ec: ExecutionContext): Future[Long] = ???
def opB(b: Int)(using ec: ExecutionContext): Future[Long] = ???
def opC(c: Long)(using ec: ExecutionContext): Future[Long] = ???

//def myOp(text: String)(using ec: ExecutionContext): Future[Long] =
//  for {
//    a <- opA(text)
//    b <- opB(text.length)
//    c <- opC(a - b)
//  } yield a * b * c


// ANSWER

// You can improve the execution time of myOp by scheduling the functions opA and opB in parallel,
// because they are independent. Your solution should look like similar to the following:

def myOp(text: String)(using ec: ExecutionContext): Future[Long] = {
  val futureOpA = opA(text)
  val futureOpB = opB(text.length)
  for {
    a <- futureOpA
    b <- futureOpB
    c <- opC(a - b)
  } yield a * b * c
}

// Consider the following snippet of code. Refactor the function getUserId
// to use for-comprehension.


import scala.concurrent.{ExecutionContext, Future}

case class Order(id: Int,
                 userId: Int,
                 productId: Int,
                 quantity: Double)

def getOrder(id: Int)
            (using ec: ExecutionContext): Future[Order] = ???

//def getUserId(orderId: Int)(using ec: ExecutionContext): Future[Int] =
//   getOrder(orderId).map(_.userId)


// ANSWER

def getUserId(orderId: Int)(using ec: ExecutionContext): Future[Int] =
  for {
    order <- getOrder(orderId)
  } yield order.userId

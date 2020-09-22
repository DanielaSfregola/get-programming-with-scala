// Consider the following snippet of code: refactor the function getUserId
// to use a for-comprehension statement.


import scala.concurrent.{ExecutionContext, Future}

case class Order(id: Int, userId: Int, productId: Int, quantity: Double)

def getOrder(id: Int)(implicit ec: ExecutionContext): Future[Order] = ???

//def getUserId(orderId: Int)(implicit ec: ExecutionContext): Future[Int] =
//   getOrder(orderId).map(_.userId)


// ANSWER

def getUserId(orderId: Int)(implicit ec: ExecutionContext): Future[Int] =
  for {
    order <- getOrder(orderId)
  } yield order.userId

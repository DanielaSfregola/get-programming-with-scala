import scala.concurrent.{ExecutionContext, Future}

case class Availability(id: Int, quantity: Double)
case class Order(id: Int, customerId: Int,
                 productId: Int, quantity: Double)

private def getAvailability(productId: Int)
                           (using ec: ExecutionContext): Future[Availability] = ???

private def createOrder(customerId: Int,
                        productId: Int,
                        quantity: Double)
                       (using ec: ExecutionContext): Future[Order] = ???

def placeOrder(customerId: Int,
               productId: Int,
               quantity: Double)
              (using ec: ExecutionContext): Future[Future[Order]] = {
  getAvailability(productId).map { availability =>
    if (quantity <= availability.quantity)
      createOrder(customerId = customerId, productId = productId, quantity)
    else throw new IllegalStateException(
      s"Product $productId unavailable: requested $quantity, available ${availability.quantity}")
  }
}

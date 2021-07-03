import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

def isProductAvailable(productId: Int,
                       quantity: Double): Future[Boolean] = Future {
  requestAvailability(productId, quantity)
}

/*private*/ def requestAvailability(productId: Int,
                                quantity: Double): Boolean = ???

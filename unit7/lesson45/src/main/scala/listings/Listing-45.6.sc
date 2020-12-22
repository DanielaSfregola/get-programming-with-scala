import scala.concurrent.{ExecutionContext, Future}

sealed trait Warehouse
case object London extends Warehouse
case object Brighton extends Warehouse
case object Leeds extends Warehouse

object Warehouse {
  val all: List[Warehouse] = List(London, Brighton, Leeds)
}

case class Availability(productId: Int,
                        quantity: Double,
                        location: Warehouse)

def checkAvailability(productId: Int, warehouse: Warehouse)
                     (using ec: ExecutionContext): Future[Availability] = ???

def getAvailability(productId: Int, quantity: Double)
                   (using ec: ExecutionContext): Future[Option[Availability]] =
  Future.find(
    Warehouse.all.map(checkAvailability(productId, _))
  )(availability => availability.quantity >= quantity)

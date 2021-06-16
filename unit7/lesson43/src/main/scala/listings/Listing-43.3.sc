import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global

case class Availability(id: Int, quantity: Double)

def trackAvailability(availability: Future[Availability]): Unit =
  availability.onComplete {
    case Success(p) if p.quantity <= 0 =>
      println(s"Product ${p.id} is not available")
    case Success(p) =>
      println(s"Product ${p.id} has available quantity ${p.quantity}")
    case Failure(ex) =>
      println(s"Couldn't get the availability " +
      s"because of ${ex.getMessage}")
  }

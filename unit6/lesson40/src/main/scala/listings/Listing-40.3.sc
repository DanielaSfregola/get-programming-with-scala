import scala.util.{Failure, Success, Try}
import scala.util.control.NonFatal

object Try {

  def apply[T](r: => T): Try[T] =
    try Success(r) catch {
      case NonFatal(e) => Failure(e)
    }
}

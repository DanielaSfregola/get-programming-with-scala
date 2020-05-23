sealed abstract class Try[T]

case class Success[T](t: T) extends Try[T]

case class Failure[T](throwable: Throwable) extends Try[T]

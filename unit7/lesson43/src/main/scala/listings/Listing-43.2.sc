package scala.concurrent

object Future {

  def apply[T](r: => T)
              (implicit ec: ExecutionContext): Future[T] = {
    ???
  }
}

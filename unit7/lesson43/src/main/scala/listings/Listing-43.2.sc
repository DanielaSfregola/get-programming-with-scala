package scala.concurrent

object Future {

  def apply[T](r: => T)
              (using ec: ExecutionContext): Future[T] = {
    ???
  }
}

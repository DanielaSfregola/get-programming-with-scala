package cats.effect

class IO[A] {

  def unsafeRunAsync(cb: Either[Throwable, A] => Unit): Unit = ???

  def unsafeRunAsyncAndForget(): Unit = ???

}

object IO {
  def async[A](k: (Either[Throwable, A] => Unit) => Unit): IO[A] = ???
}

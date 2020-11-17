package cats.effect

class IO[A] {
  def unsafeRunSync(): A = ???
}

object IO {
  def apply[A](body: => A): IO[A] = ???
}

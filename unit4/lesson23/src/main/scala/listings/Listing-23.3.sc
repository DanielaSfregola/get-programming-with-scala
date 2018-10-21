sealed abstract class Option[+A] {

  case class Some[A](a: A) extends Option[A]
  case object None extends Option[Nothing]

  def map[B](f: A => B): Option[B] =
    this match {
      case Some(a) => Some(f(a))
      case None => None
    }
}

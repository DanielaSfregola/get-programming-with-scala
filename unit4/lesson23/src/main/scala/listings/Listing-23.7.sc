sealed abstract class Option[+A] {

  case class Some[A](a: A) extends Option[A]
  case object None extends Option[Nothing]

  def flatMap[B](f: A => Option[B]): Option[B] =
    this match {
      case Some(a) => f(a)
      case None => None
    }
}

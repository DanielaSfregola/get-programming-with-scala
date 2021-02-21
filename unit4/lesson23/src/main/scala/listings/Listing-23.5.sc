sealed abstract class Option[+A] {

  case class Some[A](a: A) extends Option[A]
  case object None extends Option[Nothing]

  def flatten[B](implicit ev: A <:< Option[B]): Option[B] =
    this match {
      case Some(opt) => opt
      case None => None
     }
}

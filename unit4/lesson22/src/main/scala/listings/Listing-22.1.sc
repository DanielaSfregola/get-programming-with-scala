sealed abstract class Option[A]

final case class Some[A](a: A) extends Option[A]
case object None extends Option[Nothing]

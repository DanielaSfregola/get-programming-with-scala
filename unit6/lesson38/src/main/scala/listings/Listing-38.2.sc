sealed abstract class Either[A, B]

case class Left[A, B](value: A) extends Either[A, B]

case class Right[A, B](value: B) extends Either[A, B]

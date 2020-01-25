sealed abstract class List[+A] {

  case class ::[A](head: A, tail: List[A]) extends List[A]
  case object Nil extends List[Nothing]

  def map[B](f: A => B): List[B] =
    this match {
      case Nil => Nil
      case head :: tail => f(head) :: tail.map(f)
    }
}

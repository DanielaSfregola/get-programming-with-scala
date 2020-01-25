sealed abstract class List[+A] {

  case class ::[A](head: A, tail: List[A]) extends List[A]
  case object Nil extends List[Nothing]

  def ++[B >: A](other: List[B]): List[B] = ???

  def flatMap[B](f: A => List[B]): List[B] =
    this match {
      case Nil => Nil
      case head :: tail => f(head) ++ tail.flatMap(f)
    }
}

sealed abstract class List[A] {
  def head: A
  def tail: List[A]
}

case object Nil extends List[Nothing] {
  def head = throw new NoSuchElementException("head of empty list")
  def tail: List[Nothing] = throw new UnsupportedOperationException("tail of empty list")
}

case class ::[A](head: A, tail: List[A]) extends List[A]

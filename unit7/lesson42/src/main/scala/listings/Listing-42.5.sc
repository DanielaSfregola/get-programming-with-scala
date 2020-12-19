trait Show[T] {

  def show(t: T): String
}


object Show {

  // In Scala 2: implicit val stringShow: Show[String] = new Show[String] {
  given stringShow: Show[String] with {
    override def show(s: String): String = s
  }

  // In Scala 2: implicit val intShow: Show[Int] = new Show[Int] {
  given intShow: Show[Int] with {
    override def show(i: Int): String = i.toString
  }

  // In Scala 2: implicit def listShow[T]: Show[List[T]] = new Show[List[T]] {
  given listShow[T]: Show[List[T]] = new Show[List[T]] {
    override def show(l: List[T]): String = l.mkString(", ")
  }
}

// In Scala 2, use the keyword 'implicit' instead of 'using'
def prettyPrintln[T](t: T)(using s: Show[T]): Unit =
  println(s.show(t))

prettyPrintln(1)
prettyPrintln("hello")
prettyPrintln(List(1, 2, 3))

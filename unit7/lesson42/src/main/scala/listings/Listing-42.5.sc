trait Show[T] {

  def show(t: T): String
}


object Show {

  implicit val stringShow: Show[String] = new Show[String] {
    override def show(s: String): String = s
  }

  implicit val intShow: Show[Int] = new Show[Int] {
    override def show(i: Int): String = i.toString
  }

  implicit def listShow[T]: Show[List[T]] = new Show[List[T]] {
    override def show(l: List[T]): String = l.mkString(", ")
  }
}


def prettyPrintln[T](t: T)(implicit s: Show[T]): Unit =
  println(s.show(t))

prettyPrintln(1)
prettyPrintln("hello")
prettyPrintln(List(1, 2, 3))

Right(42).isLeft
// val res0: Boolean = false

Left("hello").isLeft
// val res1: Boolean = true

Right(42).isRight
// val res0: Boolean = true

Left("hello").isRight
// val res1: Boolean = false

val e: Either[String, Int] = Left("hello")
// val e: Either[String,Int] = Left(hello)

e.exists(_ > 0)
// val res0: Boolean = false
// Omitting the function call to right because Either is right-biased

e.left.exists(_.startsWith("scala"))
// val res1: Boolean = false

e.left.exists(_.size > 3)
// val res2: Boolean = true

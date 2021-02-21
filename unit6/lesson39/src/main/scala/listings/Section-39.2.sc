Right(42).isLeft
// res0: Boolean = false

Left("hello").isLeft
// res1: Boolean = true

Right(42).isRight
// res0: Boolean = true

Left("hello").isRight
// res1: Boolean = false

val e: Either[String, Int] = Left("hello")
// e: Either[String,Int] = Left(hello)

e.exists(_ > 0)
// res0: Boolean = false
// Omitting the function call to right because Either is right-biased

e.left.exists(_.startsWith("scala"))
// res1: Boolean = false

e.left.exists(_.size > 3)
// res2: Boolean = true

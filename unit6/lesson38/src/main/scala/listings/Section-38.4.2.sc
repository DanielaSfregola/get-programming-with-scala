val e: Either[String, Int] = Right(25)
// val e: Either[String,Int] = Right(25)

e.flatMap { n =>
  if (n < 0) Left(s"Found Negative number $n")
  else Right(Math.sqrt(n))
}
// val res0: scala.util.Either[String,Double] = Right(5.0)
// The compiler infers the type String for its left side

e.flatMap { n =>
  if(n < 0) Left(-1)
  else Right(Math.sqrt(n))
}
// val res1: scala.util.Either[Any,Double] = Right(5.0)
// The left side has type Any because it is
// the common superclass between String and Int

Left("").left.flatMap { text =>
  if (text.isEmpty) Right(42.0)
  else Left(text)
}
// val res2: scala.util.Either[String,Double] = Right(42.0)

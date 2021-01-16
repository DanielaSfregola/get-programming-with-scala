val e1: Either[String, Int] = Right(42)
// e: Either[String,Int] = Right(42)

e1.left.map(_.size)
// res0: scala.util.Either[Int,Int] = Right(42)
// Its left side has now type Int rather than String
// but your instance has not been modified

e1.right.map(_ * 2.0)
// res1: scala.util.Either[String,Double] = Right(84.0)
// Your instance is a right, so it transforms it into a Double
// by multiplying it by 2.0

e1.map(_ * 2.0)
// res2: scala.util.Either[String,Double] = Right(84.0)
// No need to invoke right as Either is right-biased


val e2: Either[String, Int] = Right(25)
// e2: Either[String,Int] = Right(25)

e2.flatMap { n =>
  if (n < 0) Left(s"Found Negative number $n")
  else Right(Math.sqrt(n))
}
// res0: scala.util.Either[String,Double] = Right(5.0)
// The compiler infers the type String for its left side

e2.flatMap { n =>
  if(n < 0) Left(-1)
  else Right(Math.sqrt(n))
}
// res1: scala.util.Either[Any,Double] = Right(5.0)
// The left side has type Any because it is
// the common superclass between String and Int

e2.left.flatMap { text =>
  if (text.isEmpty) Right(42.0)
  else Left(text)
}
// res1: scala.util.Either[String,Double] = Right(42.0)
// The right side has type Double because it is
// the common superclass between Int and Double

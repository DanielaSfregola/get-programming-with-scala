val e: Either[String, Int] = Right(42)
// val e: Either[String,Int] = Right(42)

e.left.map(_.size)
// val res0: scala.util.Either[Int,Int] = Right(42)
// Its left side has now type Int rather than String
// but your instance has not been modified

e.right.map(_ * 2.0)
// val res1: scala.util.Either[String,Double] = Right(84.0)
// Your instance is a right, so it transforms it into a Double
// by multiplying it by 2.0

e.map(_ * 2.0)
// val res2: scala.util.Either[String,Double] = Right(84.0)
// No need to invoke right as Either is right-biased

val value: Either[Int, String] = Left(1234)
// val value: Either[Int,String] = Left(1234)

value.left.map(v => v + 1)
// val res0: scala.util.Either[Int,String] = Left(1235)

for {
  v <- value.left
} yield v + 1
// val res1: scala.util.Either[Int,String] = Left(1235)

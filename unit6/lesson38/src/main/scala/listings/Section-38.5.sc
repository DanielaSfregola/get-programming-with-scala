val value: Either[Int, String] = Left(1234)
// value: Either[Int,String] = Left(1234)

value.left.map(v => v + 1)
// res0: scala.util.Either[Int,String] = Left(1235)

for {
  v <- value.left
} yield v + 1
// res1: scala.util.Either[Int,String] = Left(1235)

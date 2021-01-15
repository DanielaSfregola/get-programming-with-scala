List(1,2,3).apply(0)
// res12: Int = 1
// expression equivalent to List(1,2,3)(0)

List(1,2,3).apply(3)
// java.lang.IndexOutOfBoundsException: 3
// at scala.collection.LinearSeqOptimized.apply(LinearSeqOptimized.scala:63)
// expression equivalent to List(1,2,3)(3)

List().headOption
// res10: Option[Nothing] = None

List(1, 2, 3).headOption
// res11: Option[Int] = Some(1)


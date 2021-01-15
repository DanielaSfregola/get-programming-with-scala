List(1, 2, 3).sum
// res0: Int = 6

List(1.4, 2.5, 3.6).sum
// res1: Double = 7.5

List.empty[Float].sum
// res2: Float = 0.0

List("hello", "scala").sum
// <console>:13: error: could not find implicit value for parameter num: Numeric[String]
  // The compiler could not find an implementation for Numeric[String]
  // since String is not a numeric type

val a: Either[String, Int] = Left("scala")
// val a: Either[String,Int] = Left(scala)

val b1: Either[String, Int] = Left(42)
// <console>:11: error: type mismatch;
//   found   : Int(42)
//   required: String
//  val b: Either[String, Int] = Left(42)
// Left must contain a value of type String!

val b2: Either[String, Int] = Right(42)
// val b2: Either[String,Int] = Right(42)

val c: Either[String, Int] = Right("scala")
// <console>:11: error: type mismatch;
//   found   : String("scala")
//   required: Int
// Right must contain a value of type Int!

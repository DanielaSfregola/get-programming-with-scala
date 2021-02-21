Right(42).getOrElse(0)
// res0: Int = 42
// You can omit the call to the right function because
// Either is right from Scala 2.12+

Left("hello").left.getOrElse("scala")
// res4: String = hello

Right(42).left.getOrElse("scala")
// res5: String = scala

Right(42).getOrElse { println("generating default..."); 0 }
// res1: Int = 42
// It doesn’t evaluate the default expression

Left("hello").getOrElse { println("generating default..."); 0 }
// generating default...
// res2: Int = 0
// It executes the default expression

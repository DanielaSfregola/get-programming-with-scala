Right(42).getOrElse(0)
// val res0: Int = 42
// You can omit the call to the right function because
// Either is right from Scala 2.12+

Left("hello").left.getOrElse("scala")
// val res4: String = hello

Right(42).left.getOrElse("scala")
// val res5: String = scala

Right(42).getOrElse { println("generating default..."); 0 }
// val res1: Int = 42
// It doesn’t evaluate the default expression

Left("hello").getOrElse { println("generating default..."); 0 }
// generating default...
// val res2: Int = 0
// It executes the default expression

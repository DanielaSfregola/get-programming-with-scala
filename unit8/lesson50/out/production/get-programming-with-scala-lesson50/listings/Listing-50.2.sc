import cats.effect.IO

def fooA: IO[Int] = {
  def io = IO { println("Scala"); 5 }
  for {
    a <- io
    b <- io
  } yield a + b
}

def fooB: IO[Int] = {
  val io = IO { println("Scala"); 5 }
  for {
    a <- io
    b <- io
  } yield a + b
}



val resultA = fooA
//resultA: cats.effect.IO[Int] = IO$976545953
resultA.unsafeRunSync
//Scala
//Scala
//res0: Int = 10

val resultB = fooB
//resultB: cats.effect.IO[Int] = IO$976545953
resultB.unsafeRunSync
//Scala
//Scala
//res1: Int = 10

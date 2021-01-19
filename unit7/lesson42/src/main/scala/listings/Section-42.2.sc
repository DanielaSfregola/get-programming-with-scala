// In Scala 2: def pow(exp: Int)(implicit base: Int): Double = …
def pow(exp: Int)(using base: Int): Double = Math.pow(base, exp)

// In Scala 2: implicit val a: Int = …
given b: Int = 2 // implicit found in the local scope

pow(5)


object Base {

  // In Scala 2: implicit val b: Int = 2
  given b: Int = 2
}

// In Scala 2: import Base._
import Base.given // importing all the implicit instances in Base

// implicit found in the imported code
  pow(5)

trait Name[A] {
  def name(): String
}

object Name {

  // implicit selected
  // In Scala 2: implicit val intName: Name[Int] = new Name[Int] { … }
  given intName: Name[Int] with {
    def name() = "integer"
  }

}

// In Scala 2: def describe[T](implicit t: Name[T]): String = …
def describe[T](using t: Name[T]): String = t.name()

describe[Int]

class Test()
object Test {

  // implicit selected
  // In Scala 2: implicit val name: Name[Test] = new Name[Test] {…}
  given name: Name[Test] with {
    override def name(): String = "my-test"
  }
}

describe[Test]

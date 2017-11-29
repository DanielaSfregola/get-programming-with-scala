package lesson12

object `12.3.ClassVsCaseClass` {

  class Person(n: String, a: Int) {

    val name: String = n
    val age: Int = a

    def copy(name: String, age: Int) =
      new Person(name, age)


    override def toString(): String = s"Person($n,$a)"

    override def hashCode(): Int = ???

    override def equals(obj: Any): Boolean = ???
  }

  object Person {

    def apply(name: String, age: Int): Person =
      new Person(name, age)

    def unapply(p: Person): Option[(String, Int)] =
      Some((p.name, p.age))
  }
}

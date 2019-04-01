case class Person(name: String, age: Int)

object Person {

  def unapply(p: Person): Option[(String, Int)] =
    Some((p.name, p.age))
}


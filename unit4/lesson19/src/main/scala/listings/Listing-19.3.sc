case class Person(name: String, age: Int)

def welcome(person: Person): String = person match {
  case Person("Tom", _) => "Hello Mr Tom!"
  case Person(name, age) if age > 18 => s"Good to see you $name"
  case p @ Person(_, 18) => s"${p.name}, you look older!"
  case Person(_, _) => "Hi bro!"
}

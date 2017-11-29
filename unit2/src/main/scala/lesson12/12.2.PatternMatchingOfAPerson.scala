package lesson12

import lesson12.`12.1.ThePersonCaseClass`.Person

object `12.2.PatternMatchingOfAPerson` {

  def welcome(person: Person): String = person match {
    case Person("Tom", _) => "Good to see you Tom!"
    case Person(name, age) if age > 18 => s"Hello Mr/Mrs $name"
    case Person(_, _) => "Hello"
  }
}

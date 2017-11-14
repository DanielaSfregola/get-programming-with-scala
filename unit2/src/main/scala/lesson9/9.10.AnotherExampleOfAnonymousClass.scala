package lesson9

object `9.10.AnotherExampleOfAnonymousClass` {

  class Dog(name: String)

  val buddy = new Dog("Buddy") {
    def sing = "woof woof!"
  }

  buddy.sing

}

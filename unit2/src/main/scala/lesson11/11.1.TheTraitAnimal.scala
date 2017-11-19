package lesson11

object `11.1.TheTraitAnimal` {

  trait Animal {

    def sleep = "ZzZ"

    def eat(food: String): String

    def move(x: Int, y: Int): String
  }

}

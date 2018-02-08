package lesson11

// Listing 11.1
object TheTraitAnimal extends App {

  trait Animal {

    def sleep = "ZzZ"

    def eat(food: String): String

    def move(x: Int, y: Int): String
  }

}

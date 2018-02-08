package lesson11

import lesson11.TheTraitAnimal.Animal

// Listing 11.2
object UsageOfTraitAnimal extends App {

  class Dog extends Animal {
    def eat(food: String): String = ???

    def move(x: Int, y: Int): String = ???
  }
  val buddy = new Dog

  val max = new Animal {

    def move(x: Int, y: Int): String = ???

    def eat(food: String): String = ???

  }

}

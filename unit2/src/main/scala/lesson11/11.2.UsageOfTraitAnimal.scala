package lesson11

import lesson11.`11.1.TheTraitAnimal`.Animal

object `11.2.UsageOfTraitAnimal` {

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

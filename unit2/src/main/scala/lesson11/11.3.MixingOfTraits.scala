package lesson11

import lesson11.TheTraitAnimal.Animal

// Listing 11.3
object MixingOfTraits extends App {

  trait Cute {

    def poseForPictures: String

  }

  trait Domestic

  class Cat extends Animal with Cute with Domestic {

    def eat(food: String): String = ???

    def move(x: Int, y: Int): String = ???

    def poseForPictures: String = ???
  }

}

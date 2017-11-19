package lesson11

import lesson11.`11.1.TheTraitAnimal`.Animal

object `11.3.MixingOfTraits` {

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

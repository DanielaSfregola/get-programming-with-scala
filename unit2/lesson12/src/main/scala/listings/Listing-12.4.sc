trait Animal {

  def sleep = "ZzZ"

  def eat(food: String): String

  def move(x: Int, y: Int): String
}

trait Nameable {

  def name: String

}

class Dog(val name: String) extends Animal with Nameable {

  def eat(food: String) = s"$food $food"

  def move(x: Int, y: Int) = "let's go to ($x, $y)!"
}

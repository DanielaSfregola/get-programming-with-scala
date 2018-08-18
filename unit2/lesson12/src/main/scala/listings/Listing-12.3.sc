trait Animal {

  def sleep = "ZzZ"

  def eat(food: String): String

  def move(x: Int, y: Int): String
}

class Cat extends Animal {

  override val sleep = "sleepy cat!"

  def eat(food: String) = s"the cat is eating $food"

  def move(x: Int, y: Int) = s"the cat is moving to ($x,$y)"
}

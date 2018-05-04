trait Animal {

  def sleep = "ZzZ"

  def eat(food: String): String

  def move(x: Int, y: Int): String
}

class Cat extends Animal {

  override val sleep = ???

  def eat(food: String) = ???

  def move(x: Int, y: Int) = ???
}

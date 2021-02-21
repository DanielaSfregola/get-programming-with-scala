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

class Cat extends Animal {

  override val sleep = "sleepy cat!"

  def eat(food: String) = s"the cat is eating $food"

  def move(x: Int, y: Int) = s"the cat is moving to ($x,$y)"
}


val tiggerTheDog = new Dog("Tigger")
val cat = new Cat

def feedTreat(animal: Animal) = animal.eat("treat")
feedTreat(tiggerTheDog)
feedTreat(cat)

def welcome(nameable: Nameable) = println(s"Hi, ${nameable.name}!")
welcome(tiggerTheDog)
welcome(cat) // Doesn't compile - Cat doesn't extend Nameable

// Represent cold and hot beverages a bar can offer using classes and subclasses.
// A customer can request to add more ice to cold drinks or reheat hot ones.

abstract class Drink(name: String, price: Double)

class HotDrink(name: String, price: Double) extends Drink(name, price) {

  def reheat() = ???
}

class ColdDrink(name: String, price: Double) extends Drink(name, price) {

  def extraIce() = ???
}

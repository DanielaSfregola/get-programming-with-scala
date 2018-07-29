// A bar serves cold and hot beverages. You can request to add more ice
// to a cold drink or to reheat an hot one.
// Express these relations using classes and subclasses.


abstract class Drink(name: String, price: Double)

class HotDrink(name: String, price: Double) extends Drink(name, price) {

  def reheat() = ???
}

class ColdDrink(name: String, price: Double) extends Drink(name, price) {

  def extraIce() = ???
}

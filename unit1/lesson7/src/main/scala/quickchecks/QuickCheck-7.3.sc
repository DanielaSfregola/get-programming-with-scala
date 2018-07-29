// In Quick Check 7.1, you have defined the class Person.
// Change its implementation to force all its subclasses to implement a method,
// called hello, that takes one parameter of type string and returns a string.


abstract class Person(name: String, age: Int = 0) {

  def presentYourself = s"My name is $name and I am $age"

  def hello(n: String): String
}

// In Quick Check 7.1, you have implemented the class Person.
// Change the implementation of Person so that its subclasses must have a method hello.
// The function hello takes one parameter of type string and returns a string.

abstract class Person(name: String, age: Int = 0) {

  def presentYourself = s"My name is $name and I am $age"

  def hello(n: String): String
}

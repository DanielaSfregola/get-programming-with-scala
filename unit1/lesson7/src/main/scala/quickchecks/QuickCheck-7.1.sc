// Create a class Person with a name of type String and an age of type Int – defaulted to 0.
// Define a method, called presentYourself, for the class Person: it takes no parameters,
// and it returns a string to communicate the name and age of a Person.
// Create two instances and see what the presentYourself method returns for each of them:
// Martin, who is 18, and Bob, who is 0 years old.


class Person(name: String, age: Int = 0) {
  def presentYourself = s"My name is $name and I am $age"
}

val martin = new Person("Martin", 18)
martin.presentYourself

val bob = new Person("Bob")
bob.presentYourself

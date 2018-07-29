// In Quick Check 7.1, you defined a class Person.
// Create two subclasses of the class Person: one to represent a teacher,
// the other one to represent a student. A student should have an additional
// parameter to track its id.

class Person(name: String, age: Int = 0) {
  def presentYourself = s"My name is $name and I am $age"
}

class Teacher(name: String, age: Int) extends Person(name, age)

class Student(name: String, age: Int, id: String) extends Person(name, age)

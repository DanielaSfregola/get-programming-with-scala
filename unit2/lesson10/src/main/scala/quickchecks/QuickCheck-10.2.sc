//Consider the following snippet of code: is age accessible from the class Student?
// Use the REPL to validate your hypothesis.


// ANSWER

class Person {
  private val age = 18
}

class Student extends Person

val student = new Student
student.age

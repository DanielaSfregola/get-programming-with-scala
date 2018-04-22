// Consider this snippet of code:

class Dog(val name: String)

object Dog {
  def apply(name: String): Dog =
    new Dog(s"$name The Dog")
}
// Are the following two expressions equivalent? Explain why.

new Dog("Buddy")
Dog("Buddy")


// ANSWER:
// The two expressions are not equivalent.
// The first expression returns an instance of Dog with the name “Buddy”: it calls the constructor
// of the class Dog directly. The second expression returns an instance of Dog with the name
// “Buddy The Dog”: it calls the apply method defined in the companion object.

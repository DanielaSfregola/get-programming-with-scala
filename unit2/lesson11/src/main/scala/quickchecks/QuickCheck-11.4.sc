// Consider this snippet of code.
// Are the expressions new Dog("Tigger") and Dog("Tigger") equivalent? Why?

class Dog(val name: String)

object Dog {
  def apply(name: String): Dog =
    new Dog(s"$name The Dog")
}


// ANSWER:
// The two expressions are not equivalent.
// The first expression returns an instance of Dog with the name “Tigger”: it calls the constructor
// of the class Dog directly. The second expression returns an instance of Dog with the name
// “Tigger The Dog”: it calls the apply method defined in the companion object.

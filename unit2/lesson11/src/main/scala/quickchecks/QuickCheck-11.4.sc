// Consider this snippet of code.
// Are the expressions new Dog("Tigger") and Dog("Tigger") equivalent? Why?

class Dog(val name: String)

object Dog {
  def apply(name: String): Dog =
    new Dog(s"$name The Dog")
}

// ANSWER:

new Dog("Tigger")
Dog("Tigger")

// The two expressions are not equivalent. The first returns a Dog instance with the name
// “Tigger” because it invokes its constructor directly. The second one returns one named
// “Tigger The Dog” because it calls the apply method defined in its companion object.

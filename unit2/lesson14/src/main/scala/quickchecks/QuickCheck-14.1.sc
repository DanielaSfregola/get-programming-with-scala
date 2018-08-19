// What is the type for each of the values defined in listing 14.2?
// Use the REPL to validate your hypothesis.

object MySecondCalculator {

  val sum = { (a: Int, b: Int) => a + b }

  val subtract = { (a: Int, b: Int) => a - b }

  val multiply = { (a: Int, b: Int) => a * b }

  val divide = { (a: Int, b: Int) => a / b }

  val negate = { a: Int => subtract(0, a) }

}


// ANSWER

// The values sum, subtract, multiply, divide have the type (Int, Int) => Int,
// while the value negate has type Int => Int.

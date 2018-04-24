object MySecondCalculator {

  val sum = { (a: Int, b: Int) => a + b }

  val subtract = { (a: Int, b: Int) => a - b }

  val multiply = { (a: Int, b: Int) => a * b }

  val divide = { (a: Int, b: Int) => a / b }

  val negate = { a: Int => subtract(0, a) }

}

import MySecondCalculator._

sum(3, 5)
subtract(4, 4)
multiply(5, 3)
divide(6, 2)
negate(-5)

object MyThirdCalculator {

  val sum: (Int, Int) => Int = { _ + _ }

  val subtract: (Int, Int) => Int = { _ - _ }

  val multiply: (Int, Int) => Int = { _ * _ }

  val divide: (Int, Int) => Int = { _ / _ }

  val negate: Int => Int = subtract(0, _)

}

import MyThirdCalculator._

sum(3, 5)
subtract(4, 4)
multiply(5, 3)
divide(6, 2)
negate(-5)

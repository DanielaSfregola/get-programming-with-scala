object MyCalculator {

  def sum(a: Int, b: Int): Int = a + b

  def subtract(a: Int, b: Int): Int = a - b

  def multiply(a: Int, b: Int): Int = a * b

  def divide(a: Int, b: Int): Int = a / b

  def negate(a: Int): Int = subtract(0, a)

}

import MyCalculator._

sum(3, 5)
subtract(4, 4)
multiply(5, 3)
divide(6, 2)
negate(-5)

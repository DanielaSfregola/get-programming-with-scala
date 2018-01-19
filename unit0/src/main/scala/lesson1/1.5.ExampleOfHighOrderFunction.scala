package lesson1

object `1.5.ExampleOfHighOrderFunction` {

  def plusOne(f: Int => Int): Int => Int =
    f andThen (_ + 1)

  def divideBy2(n: Int): Int = n / 2

  def divideBy2Plus1 = plusOne(divideBy2)

}

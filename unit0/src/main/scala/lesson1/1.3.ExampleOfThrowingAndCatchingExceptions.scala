package lesson1

object `1.3.ExampleOfThrowingAndCatchingExceptions` {

  try {
    throw new IllegalStateException("BOOM!")
  } catch {
    case ex :RuntimeException =>
      println("Something exploded...")
  }

}

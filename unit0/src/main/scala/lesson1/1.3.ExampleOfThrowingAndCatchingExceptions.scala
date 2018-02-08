package lesson1

// Listing 1.3
object ExampleOfThrowingAndCatchingExceptions extends App {

  try {
    throw new IllegalStateException("BOOM!")
  } catch {
    case ex :RuntimeException =>
      println("Something exploded...")
  }

}

// The following expression throws an IllegalArgumentException exception:
// val b = "hello".toBoolean
// Write a try-catch statement to default any non-parsable value to false.


// ANSWER
// You could change the expression val b = "hello".toBoolean as follows:

val b = try {
    "hello".toBoolean
  } catch {
    case _: IllegalArgumentException => false
  }

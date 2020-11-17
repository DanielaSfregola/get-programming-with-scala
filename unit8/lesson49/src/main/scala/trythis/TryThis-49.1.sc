// In this lesson, you have seen how to measure duration in seconds of two specific operations:
// initializing a player and retrieving its game statistics.
// Reuse the same logic to define a function, called timed, to measure the execution time
// in seconds of any operation.



// ANSWER

import java.time._
def timed[T](operation: => T): T = {
  val start = Instant.now()
  val t = operation
  val duration = Duration.between(start, Instant.now())
  println(s"Took ${duration.getSeconds} seconds!")
  t
}

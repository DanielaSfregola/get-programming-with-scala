// Use pattern matching to define a function sum that takes a list of integers as its parameter
// and it returns an integer representing the sum of all its elements.


// ANSWER

// A possible implementation for the function sum is the following:

def sum(numbers: List[Int]): Int = numbers match {
  case Nil => 0
  case head :: tail => head + sum(tail)
}

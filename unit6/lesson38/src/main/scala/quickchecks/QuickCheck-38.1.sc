// Implement a function called sqrt that takes an integer. It returns the square root of
// the given number if nonnegative, a message otherwise explaining that this operation
// for negative numbers is not supported.


// ANSWER

def sqrt(n: Int): Either[String, Double] =
  if (n < 0) Left("Operation not supported for negative numbers")
  else Right(Math.sqrt(n))

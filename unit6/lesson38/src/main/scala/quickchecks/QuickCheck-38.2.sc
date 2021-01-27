// Implement a method called sqrtOrZero that takes an integer. It uses the function sqrt
// that you have implemented in the previous quick check to compute the square root of the number.
// Use pattern matching to return zero when the operation is not supported.


// ANSWER

def sqrt(n: Int): Either[String, Double] =
  if (n < 0) Left("Operation not supported for negative numbers")
  else Right(Math.sqrt(n))

def sqrtOrZero(n: Int): Double =
  sqrt(n) match {
    case Left(_) => 0
    case Right(d) => d
  }

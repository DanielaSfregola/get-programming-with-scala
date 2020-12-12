// Implement a function called isPositive that takes a value of type Either[String, Double],
// and it returns true if it contains a double bigger than zero, false otherwise.


// ANSWER

def isPositive(value: Either[String, Double]): Boolean =
  value.exists(_ > 0)
  // or alternatively
  // value.right.exists(_ > 0)

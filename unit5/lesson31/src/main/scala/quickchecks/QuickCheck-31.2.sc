// Implement a function that, given a list of double, returns a new sequence
// containing only its non-negative numbers:
//
// def filterNonNegative(numbers: List[Double]): List[Double]
//
// For example, given a sequence containing the numbers -12.34, 0, and 56.78
// it should return a new list with only the numbers 0 and 56.78.

// ANSWER

def filterNonNegative(numbers: List[Double]): List[Double] =
  numbers.filterNot(_ < 0)
// ...or alternatively...
// numbers.filter(_ >= 0)

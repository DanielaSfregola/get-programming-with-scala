// Define a function called sumInRange that takes a set of doubles, and it returns
// the sum of all its values with those between 0 and 100 excluded. For example, given the numbers
// 0.5, -1, 0 50.5, 99, and 100, it should return the double 150.00.

// ANSWER

def sumInRange(numbers: Set[Double]): Double =
  numbers.filter(d => d > 0 && d < 100).sum

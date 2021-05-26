// Write a function sumOfFirstN to sum all numbers for 0 to n inclusive:

// def sumOfFirstN(n: Int): Int

// For example, sumOfFirstN(10) should return 55, and sumOfFirstN(-10) should return 0.
// HINT: You can generate a sequential structure containing all numbers from 0 to n inclusive
// using the operator to. For example, the expression 0 to 3 returns a range containing
// the numbers 0, 1, 2, and 3.


// ANSWER

// A possible implementation for the function sumOfFirstN is the following:

def sumOfFirstN(n: Int): Int = (0 to n).sum

// The expression 0 to n produces a sequence like structure called “inclusive range”, which contains
// all the numbers from 0 to n inclusive. You can invoke the toList function to convert a range
// to a list:

val range = 0 to 10
// range: scala.collection.immutable.Range.Inclusive = Range 0 to 10
range.toList
// res0: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

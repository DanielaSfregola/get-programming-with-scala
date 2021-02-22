// Define a function pow that takes two parameters of type Int, and that returns an Int:
// call the first parameter exponent and the second one base with a default of two.
// The function should calculate the power of a number as follows: if the parameter exponent has
// a value of three and base two, it should compute 2^3. Implement the function using a loop,
// without using the function Math.pow.

def pow(exponent: Int, base: Int = 2): Int = {
  var result = 1
  for (e <- 1 to exponent) {
    result *= base
  }
  result
}

println(pow(3, 5))

// In the previous quick check, you have implemented a function called foo.
// Modify your implementation to add the function toDouble from the class Int as the default
// of its parameter f.

// ANSWER

def foo(f: Int => Double = _.toDouble): Double = f(42) + 2

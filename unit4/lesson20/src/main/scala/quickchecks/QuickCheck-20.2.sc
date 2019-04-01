// In the previous quick check you have implemented a function called foo. Modify your implementation
// to add a default to its function parameter f: the toDouble function of the class Int.

def foo(f: Int => Double = _.toDouble): Double = f(42) + 2

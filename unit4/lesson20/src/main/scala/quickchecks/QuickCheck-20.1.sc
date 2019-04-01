// Write a function called foo that takes a function f of type Int => Double as its parameter and
// returns a Double: apply 42 to the function parameter and then add 2 to its result.

def foo(f: Int => Double): Double = f(42) + 2

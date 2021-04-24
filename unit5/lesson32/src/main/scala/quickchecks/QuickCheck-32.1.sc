// Consider the following snippet of code:

List().sorted

// Does it compile? If so, what does it return? Why? Use the REPL to validate your hypothesis.


// ANSWER

// The snippet of code List().sorted does not compile:
//
// scala> List().sorted
// <console>:13: error: diverging implicit expansion for type scala.math.Ordering[B]
//  starting with method Tuple9 in object Ordering
//  List().sorted
//  ^
// The snippet List() has type List[Nothing]. When invoking the function sorted on it,
// the compiler looks for an instance of Ordering[Nothing] to use in the ordering;
// the compiler cannot find exactly one, so it rejects the expression as valid.

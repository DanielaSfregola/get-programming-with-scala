// Consider the following snippet of code:

List().sorted

// Does it compile? If so, what does it return? Why? Use the REPL to validate your hypothesis.


// ANSWER

// The snippet of code List().sorted does not compile:
//
// scala> List().sorted
//    error: diverging implicit expansion for type Ordering[B]
//    starting with method Tuple9 in object Ordering
// The snippet List() has type List[Nothing]. When invoking the function sorted on it,
// the compiler looks for an instance of Ordering[Nothing] to use in the ordering;
// the compiler cannot find exactly one, so it rejects the expression as valid.

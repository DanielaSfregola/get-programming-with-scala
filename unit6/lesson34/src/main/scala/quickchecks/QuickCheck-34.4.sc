// Consider the snippet of code Set(3).flatten. What does it return? Why?
// Use the Scala REPL to validate your hypothesis.


// ANSWER

// The expression Set(3).flatten does not compile. You can use the flatten function
// only on nested structures; Set(3) is not.

Set(3).flatten
//<console>:12: error: No implicit view available from Int => IterableOnce[B].
//  Set(3).flatten
//  ^



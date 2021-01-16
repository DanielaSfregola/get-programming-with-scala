// Consider the following snippet of code. What does it return? Why?
// Use the Scala REPL to validate your hypothesis.


// ANSWER

// The statement doesn’t compile because an integer is not a valid representation for the entry of a dictionary:

Map(42 -> "hi") + 3
// 1 |Map(42 -> "hi") + 3
//  |                  ^
//  |                  Found:    (3 : Int)
//  |                  Required: (Any, Any)

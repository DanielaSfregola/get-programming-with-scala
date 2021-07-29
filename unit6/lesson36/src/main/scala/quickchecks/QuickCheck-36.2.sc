// Consider the following snippet of code. What does it return? Why?
// Use the Scala REPL to validate your hypothesis:
// Map(42 -> "hi") + 3

// ANSWER

// The snippet of code doesn’t compile because an integer is not a valid representation for the entry of a dictionary:

Map(42 -> "hi") + 3
// error: type mismatch;
// found   : Int(3)
// required: (Int, ?)

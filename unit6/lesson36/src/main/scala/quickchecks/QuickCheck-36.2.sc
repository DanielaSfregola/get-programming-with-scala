// Consider the following snippet of code. What does it return? Why?
// Use the Scala REPL to validate your hypothesis.


// ANSWER

// The statement doesn’t compile because you cannot add an entry of type (String, Int) to a key-value data structure of type Map[Int, String]:

Map(42 -> "hi") + ("*" -> 42)
// <console>:12: error: type mismatch;
//  found   : (String, Int)
//  required: (Int, ?)
//  Map(42 -> "hi") + ("*" -> 42)
//  ^

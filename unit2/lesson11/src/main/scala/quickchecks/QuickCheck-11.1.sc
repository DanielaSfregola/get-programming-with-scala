// Consider the following snippet of code. Does the code compile? Why?
// Use the REPL to validate your hypothesis.

object MySnippet
new MySnippet

// ANSWER
// The code doesn’t compile. The REPL returns the following output:
//
// scala> object MySnippet
// defined object MySnippet
//
// scala> new MySnippet
// <console>:11: error: not found: type MySnippet
//
// The first statement successfully defines an object called “MySnippet”.
// The second one is incorrect: you cannot request the creation of an object.
// When using the keyword new the compiler looks for a class or type called “MySnippet”:
// an object is neither, so the compiler rejects it with a missing type error.

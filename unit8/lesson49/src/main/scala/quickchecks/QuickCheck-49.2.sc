// Consider the following snippet of code. What does it return? Why?
// What would happen if a wasn’t lazy? Use the REPL to validate your hypothesis.
// Use the REPL to validate your hypothesis. Note: make sure to evaluate all the instructions
// at the same time by copying and pasting the whole snippet of code in the REPL.

lazy val a = b
val b = "hello"
a.length


// ANSWER

// The snippet of code returns the number 5:

// scala> lazy val a = b
//      | val b = "hello"
//      | a.length
// val a: String = <lazy>
// val b: String = hello
// val res0: Int = 5

// The REPL initially does not assign a value to a, but it displays the message a: String = <lazy>.
// Then, it assigns b to the text "hello". It eventually initializes the value a when executing
// the instruction a.length, which returns the integer 5. If you do not mark the value a as lazy,
// the snippet of code throws a NullPointerException:


// scala> val a = b
// | val b = "hello"
// | a.length
// ^
// warning: Reference to uninitialized value b
// java.lang.NullPointerException: Cannot invoke "String.length()" because the return value of "a()" is null
// ... 32 elided

// Consider the following snippet of code. What does it return? Why?
// What would happen if a wasn’t lazy? Use the REPL to validate your hypothesis.
// Use the REPL to validate your hypothesis. Note: make sure to evaluate all the statements
// at the same time by copying and pasting the whole snippet of code in the REPL.

lazy val a = b
val b = "hello"
a.length


// ANSWER

// The snippet of code returns the number 5:

// scala> :paste
// // Entering paste mode (ctrl-D to finish)
//
// lazy val a = b
// val b = "hello"
// a.length

// Exiting paste mode, now interpreting.

// a: String = <lazy>
// b: String = hello
//   res0: Int = 5

// The REPL initially does not assign a value to a, but it displays the message a: String = <lazy>.
// Then, it assigns b to the text "hello". It eventually initializes the value a when executing
// the instruction a.length, which returns the integer 5. If you do not mark the value a as lazy,
// the snippet of code throws a NullPointerException:


//  scala> :paste
// // Entering paste mode (ctrl-D to finish)

//  val a = b
//  val b = "hello"
//  a.length

//   // Exiting paste mode, now interpreting.

// <pastie>:11: warning: Reference to uninitialized value b
//      val a = b
//       ^
//       java.lang.NullPointerException
//       ... 36 elided

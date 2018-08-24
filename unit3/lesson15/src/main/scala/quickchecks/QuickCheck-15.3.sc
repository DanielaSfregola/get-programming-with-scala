// Are functions funcA and funcB equivalent? In other words, do they return the same output
// when receiving the same input? Why? Use the REPL to verify your hypotheses.

val funcA: (Int, Int) => Int = { (a, b) => b / a }
val funcB: (Int, Int) => Int = { _ / _ }


// ANSWER

// Functions funcA and funcB are not equivalent because of their parameters order.
// Function funcA divides its second parameter, called b, by its first parameter, called a.
// Function funcB does the inverse: it divides its first parameter by its second one
// because the compiler substitutes them in order of their declaration.

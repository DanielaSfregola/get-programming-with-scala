// Consider these two snippets of code. Are they equivalent?
// Use the Scala REPL to validate your hypotheses.

// 1)
 Set(1, 2, 3).diff(Set(3,4))

// 2)
Set(3,4).diff(Set(1,2,3))


// ANSWER

// The two expressions are not equivalent. The difference between sets is not commutative,
// which means that its parameters' order does change the result.
// While the first expression returns the instance Set(1, 2), the other evaluates to Set(4).

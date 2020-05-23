// Consider the following two statements. What value do they return? Are they equivalent?
// 1) Set(2) + 1
// 2)	1 + Set(2)
// Use the Scala REPL to validate your hypothesis.


// ANSWER

Set(2) + 1
1 + Set(2)

// The two expressions are not equivalent. The first snippet of code creates a set containing
// the numbers 1 and 2. You can rewrite the statement Set(2) + 1 as Set(2).+(1):
// you are calling the method called + defined in the class Set.
// The second statement does not compile. The expression 1 + Set(2) corresponds to 1.+(Set(2)):
// you are calling the method + in the class Int. For this reason, the compiler thinks
// you are trying to add the set to the number one, which is an illegal operation.

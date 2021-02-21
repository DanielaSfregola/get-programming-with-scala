// Consider the following two snippets of code: what value does each of them produce?
// Use the REPL to confirm your hypotheses.
// 1.
class A(i: Int)
List(new A(0), new A(1), new A(2)).mkString(",")
// 2.
case class B(i: Int)
List(new B(0), new B(1), new B(2)).mkString(",")


// ANSWER

// The first snippet produces a string value similar to the following:
// res0: String = A@ed2f2f6,A@7c281eb8,A@65f40689
//
// The second one produces a more readable text:
// res1: String = B(0),B(1),B(2)
//
// The function mkString invokes the function toString for each element the list.
// Class B is a case class: the compiler changes its toString implementation to describe
// its structural composition. On the other hand, A is a regular class: its toString method
// refers to its default implementation in java.lang.Object which returns a text containing the
// class name and the memory address of the instance.

List().mkString

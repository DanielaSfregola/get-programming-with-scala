// What is the return value of the following snippets of code?
// Use the REPL to validate your hypothesis.

// 1.
List("Welcome", "to", "Scala").contains("scala")
// 2.
List("Welcome", "to", "Scala").exists(_.endsWith("me"))
// 3.
List("Welcome", "to", "Scala").count(_.contains("o"))
// 4.
class A(i: Int); List(new A(1)).contains(new A(1))
// 5.
case class B(i: Int); List(new B(1)).contains(new B(1))


// ANSWER

// The answers are the following:

// 1.	The compiler evaluates the expression to false because the sequence does not contain
// the word "scala". String equality is case sensitive, so “scala” and “Scala” are considered different.

// 2.	The snippet of code returns true because the word “Welcome” ends with “me”.

// 3.	The expression returns the integer 2: the words “Welcome” and “to” are the ones containing
// the string “o”.

// 4.	It returns false because class equality requires two classes to be the same, if and only if
// their memory allocation address is the same. For this reason, the following expression returns false:

new A(1).equals(new A(1))
// val res0: Boolean = false

// 5.	It returns true because case class equality requires two classes to be the same if
// they have the same structure. The following expression returns true because B is a case class:

new B(1).equals(new B(1))
// val res1: Boolean = true

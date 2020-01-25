// Consider the following snippet of code:

class A(i: Int)
val myList = List(new A(1), new A(2), new A(1))

// What is the value returned by the statement myList.distinct? Why?
// Use the REPL to validate your hypothesis.



// ANSWER

// The statement myList.distinct returns the sequence myList.
// You have declared A as a regular class rather than a case class: class equality requires
// two classes to be the same only if and only if their memory allocation address is the same.
// Notice that the following expression returns false:

new A(1).equals(new A(1))

// On the other hand, case class equality only requires two classes to be the same if and only if they have
// the same structure. If you change the code to declare A as a case class, you would receive
// a sequence containing only two elements when invoking the distinct function.

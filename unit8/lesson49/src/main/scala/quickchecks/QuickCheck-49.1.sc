// Consider the following functions. What is the behavior of their function calls?
// Use the REPL to validate your hypotheses.

def fooByValue(n: Int): Int = n + n
fooByValue { println("Scala"); 21 }

def fooByName(n: => Int): Int = n + n
fooByName { println("Scala"); 21 }


// ANSWER

// Both function calls return the value 42. However, the function fooByName prints
// the text "Scala" to the console twice, while fooByValue does it only once:

// scala> def fooByValue(n: Int): Int = n + n
// fooByValue: (n: Int)Int
//
// scala> fooByValue { println("Scala"); 21 }
// Scala
// res0: Int = 42
//
// scala> def fooByName(n: => Int): Int = n + n
// fooByName: (n: => Int)Int
//
// scala> fooByName { println("Scala"); 21 }
// Scala
// Scala
// res1: Int = 42

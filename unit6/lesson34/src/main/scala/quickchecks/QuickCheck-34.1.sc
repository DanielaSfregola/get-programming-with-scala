// Define a set containing the numbers 3 and 12.34 using the Scala REPL.
// What is the type of your Set instance? Why?


// ANSWER

// You can define a set as follows:

Set(3, 12.4)
// res0: scala.collection.immutable.Set[Double] = Set(3.0, 12.4)

// Your instance has type Set[Double] because the compiler can unify both integers
// and doubles under the type Double.

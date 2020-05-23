// Consider the following snippet of code. What does it return? Why?
// Use the Scala REPL to validate your hypothesis.

Map("hello" -> 1, "scala" -> 1).map { case (w, n) => n -> w }


// ANSWER

// The expression returns a key-value data structure containing one entry rather than two.
// Your output may change slightly depending on the Scala version you are using:

Map("hello" -> 1, "scala" -> 1).map { case (w, n) => n -> w }
// res0: scala.collection.immutable.Map[Int,String] = Map(1 -> scala)

// The snippet of code creates a new Map by swapping keys with values. Because its keys must
// be unique, the compiler overrides new entries with the same key without warnings.
// You should be careful when transforming data of a Map, or you may discard it without realizing it!

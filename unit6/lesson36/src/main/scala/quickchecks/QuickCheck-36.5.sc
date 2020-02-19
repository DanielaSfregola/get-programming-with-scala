// Consider the following snippet of code. What does it return? Why?
// Use the Scala REPL to validate your hypothesis.

Map("hello" -> 1, "scala" -> 10).flatMap { case (w, n) =>
  if (w.length > n ) Some(w -> n) else None
}


// ANSWER

// The snippet of code evaluates to a key-value data structure containing the entry ("hello", 1):

Map("hello" -> 1, "scala" -> 10).flatMap { case (w, n) =>
  if (w.length > n ) Some(w -> n) else None
}
// res0: scala.collection.immutable.Map[String,Int] = Map(hello -> 1)

// The compiler can return its resulting value of type Iterable[(String, Int)]
// as an instance of Map[String, Int].

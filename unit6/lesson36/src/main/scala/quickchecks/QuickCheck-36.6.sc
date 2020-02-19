// Consider the following snippet of code. What does it return? Why?
// Use the Scala REPL to validate your hypothesis.

Map("hello" -> 1, "scala" -> 10).flatMap { case (w, n) =>
  if (w.length > n ) Some(w -> n) else None
}


// ANSWER

for {
  (w, n) <- Map("hello" -> 1, "scala" -> 10)
  if w.length > n
} yield w -> n

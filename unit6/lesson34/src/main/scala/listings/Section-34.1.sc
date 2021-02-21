Set(1, 2, 3)
// res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
// a set containing the numbers 1, 2, and 3

Set("hello", "hi", "hello")
// res1: scala.collection.immutable.Set[String] = Set(hello, hi)
// A set contains no duplicates, so it contains the word "hello" only once

Set(1, "scala")
// res2: scala.collection.immutable.Set[Any] = Set(1, scala)

Set()
// res3: scala.collection.immutable.Set[Nothing] = Set()
// An empty set for instances of Nothing

Set.empty[Double]
// res4: scala.collection.immutable.Set[Double] = Set()
// The empty function allows you to create an empty Set for a given type

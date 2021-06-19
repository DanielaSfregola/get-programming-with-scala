Set(1, 2, 3)
// val res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
// a set containing the numbers 1, 2, and 3

Set("hello", "hi", "hello")
// val res1: scala.collection.immutable.Set[String] = Set(hello, hi)
// A set contains no duplicates, so it contains the word "hello" only once

Set(1, "scala")
// val res2: scala.collection.immutable.Set[Any] = Set(1, scala)

Set()
// val res3: scala.collection.immutable.Set[Nothing] = Set()
// An empty set for instances of Nothing

Set.empty[Double]
// val res4: scala.collection.immutable.Set[Double] = Set()
// The empty function allows you to create an empty Set for a given type

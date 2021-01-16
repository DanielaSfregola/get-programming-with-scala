Set(0, 2, 4).map(_ * 3)
// res0: scala.collection.immutable.Set[Int] = Set(0, 6, 12)
// multiplying each element by three

Set.empty[Int].map(_ * 3)
// res1: scala.collection.immutable.Set[Int] = Set()
// The set is empty, no elements to multiply by three!


Set(Set(1), Set(2)).flatten
// res0: scala.collection.immutable.Set[Int] = Set(1, 2)

Set(Set(1), Set(1)).flatten
// res1: scala.collection.immutable.Set[Int] = Set(1)
// duplicated element 1 is shown once

Set(Set(), Set()).flatten
// res2: scala.collection.immutable.Set[Nothing] = Set()


Set(1, 2, 3).flatMap(n => Set("a", "b").map(_ * n))
// res0: scala.collection.immutable.Set[String] = Set(a, b, bbb, aa, bb, aaa)
// repeating the strings "a" and "b" a number of times
// equal to the corresponding set element.

Set.empty[Int].flatMap(n => Set("a", "b").map(_ * n))
// res1: scala.collection.immutable.Set[String] = Set()
// The set is empty, so it returns a group with no strings.

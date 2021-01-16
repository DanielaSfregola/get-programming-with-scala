Set(1, 2, 3).flatMap(n => Set("a", "b").map(_ * n))
// res0: scala.collection.immutable.Set[String] = Set(a, b, bbb, aa, bb, aaa)

for {
  n <- Set(1, 2, 3)
  s <- Set("a", "b")
} yield s * n
// res1: scala.collection.immutable.Set[String] = Set(a, b, bbb, aa, bb, aaa)

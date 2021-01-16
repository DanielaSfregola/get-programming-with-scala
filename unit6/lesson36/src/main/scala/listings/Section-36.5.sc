for {
  (a, b) <- Map(1 -> 2, 0 -> 2, 2 -> 0)
  if a > 0 && b > 0
} yield a -> b
// res0: scala.collection.immutable.Map[Int,Int] = Map(1 -> 2)

for {
  (a, b) <- Map(1 -> 2, 0 -> 2, 2 -> 0)
  if a > 0 && b > 0
} yield a * b
// res1: scala.collection.immutable.Iterable[Int] = List(2)

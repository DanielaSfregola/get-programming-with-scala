Set(1, 2, 3).union(Set(1, 4))
// res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
// The following two expressions are also equivalent:
// Set(1, 2, 3) union Set(1, 4)
// Set(1, 2, 3) ++ Set(1, 4)

Set(1, 2, 3).union(Set())
// res1: scala.collection.immutable.Set[Int] = Set(1, 2, 3)
// Alternatively, you can also write …
// Set(1, 2, 3) union Set()
// Set(1, 2, 3) ++ Set()


Set(1, 2, 3).intersect(Set(1, 4))
// res0: scala.collection.immutable.Set[Int] = Set(1)
// You can also write:
// Set(1, 2, 3) intersect Set(1, 4)
// Set(1, 2, 3) & Set(1,4)

Set(1, 2, 3).intersect(Set())
// res1: scala.collection.immutable.Set[Int] = Set()
// Or alternativelY:
// Set(1, 2, 3) intersect Set()
// Set(1, 2, 3) & Set()


Set(1, 2, 3).diff(Set(1, 4))
// res0: scala.collection.immutable.Set[Int] = Set(2, 3)
// You following two statements are also equivalent:
// Set(1, 2, 3) diff Set(1, 4)
// Set(1, 2, 3) -- Set(1, 4)

Set(1, 4).diff(Set(1, 2, 3))
// res1: scala.collection.immutable.Set[Int] = Set(4)
// Or you can write:
// Set(1, 4) diff Set(1, 2, 3)
// Set(1, 4) -- Set(1, 2, 3)

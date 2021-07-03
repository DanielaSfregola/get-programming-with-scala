Map(1 -> "hello") + (2 -> "scala")
// val res0: scala.collection.immutable.Map[Int,String] = Map(1 -> hello, 2 -> scala)

Map() + (1 -> "scala")
// val res1: scala.collection.immutable.Map[Int,String] = Map(1 -> scala)

Map(1 -> "hello") + (1 -> "scala")
// val res2: scala.collection.immutable.Map[Int,String] = Map(1 -> scala)
// The value "hello" is no longer in the map.

Map(1 -> "hello", 2 -> "scala") - 1
// val res0: scala.collection.immutable.Map[Int,String] = Map(2 -> scala)
// Removing entry with key 1

Map(1 -> "hello", 2 -> "scala") - 3
// val res1: scala.collection.immutable.Map[Int,String] = Map(1 -> hello, 2 -> scala)
// Removing a non-existing key returns the original Map.

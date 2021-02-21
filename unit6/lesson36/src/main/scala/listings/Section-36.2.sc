Map(1 -> "hello") + (2 -> "scala")
// res0: scala.collection.immutable.Map[Int,String] = Map(1 -> hello, 2 -> scala)

Map() + (1 -> "scala")
// res1: scala.collection.immutable.Map[Int,String] = Map(1 -> scala)

Map(1 -> "hello") + (1 -> "scala")
// res2: scala.collection.immutable.Map[Int,String] = Map(1 -> scala)
// The value "hello" is no longer in the map.

Map(1 -> "hello", 2 -> "scala") - 1
// res0: scala.collection.immutable.Map[Int,String] = Map(2 -> scala)
// Removing entry with key 1

Map(1 -> "hello", 2 -> "scala") - 3
// res1: scala.collection.immutable.Map[Int,String] = Map(1 -> hello, 2 -> scala)
// Removing a non-existing key returns the original Map.

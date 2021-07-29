Map(1 -> "hello") ++ Map(2 -> "scala")
// val res0: scala.collection.immutable.Map[Int,String] = Map(1 -> hello, 2 -> scala)
// Merging two key-value structures

Map(1 -> "hello") ++ Map()
// val res1: scala.collection.immutable.Map[Int,String] = Map(1 -> hello)
// Merging a Map with the empty one

Map(1 -> "hello") ++ Map(1 -> "scala")
// val res2: scala.collection.immutable.Map[Int,String] = Map(1 -> scala)
// The entry (1, "scala") overrides (1, "hello")

Map("Rome" -> "Italy", "London" -> "UK") -- Set("Rome", "Paris")
// val res01: scala.collection.immutable.Map[String,String] = Map(London -> UK)
// Removing the keys "Rome" and "Paris" using Set as Iterable

Map("Rome" -> "Italy", "London" -> "UK") -- List("Berlin")
// val res15: scala.collection.immutable.Map[String,String] = Map(Rome -> Italy, London -> UK)
// Removing a non-existing key, returns the original data structure
// using List as Iterable.

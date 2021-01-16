Map(1 -> "a", 2 -> "b").get(2)
// res0: Option[String] = Some(b)

Map(1 -> "a", 2 -> "b").get(3)
// res1: Option[String] = None

def defaultValue: String  = { println("Missing Key!!!"); "N/A" }
// defaultValue: String

Map(1 -> "a", 2 -> "b").getOrElse(2, defaultValue)
// res2: String = b

Map(1 -> "a", 2 -> "b").getOrElse(3, defaultValue)
// Missing key!!!
// res3: String = N/A

Map(1 -> "a", 2 -> "b").apply(2)
// res4: String = b

Map(1 -> "a", 2 -> "b").apply(3)
// java.util.NoSuchElementException: key not found: 3
// at scala.collection.immutable.Map$Map2.apply(Map.scala:135)

Map((1,"hi"), (2,"scala"))
// res0: scala.collection.immutable.Map[Int,String] = Map(1 -> hi, 2 -> scala)
// A Map containing two entries

Map((42.31, 42))
// res1: scala.collection.immutable.Map[Double,Int] = Map(42.31 -> 42)
// A Map containing one entry of type (Double, Int)

Map()
// res2: scala.collection.immutable.Map[Nothing,Nothing] = Map()
// The empty Maap

Map.empty[String, Double]
// res3: scala.collection.immutable.Map[String,Double] = Map()
// The empty Map with key of type String, and values of type Double

("hello", "world")
// res0: (String, String) = (hello,world)
// creating a tuple

"hello" -> "world"
// res1: (String, String) = (hello,world)
// Equivalent creation of tuple using the -> operator

Map(1 -> "hi", 2 -> "scala")
// res0: scala.collection.immutable.Map[Int,String] = Map(1 -> hi, 2 -> scala)
// Equivalent to Map((1,"hi"), (2,"scala"))

Map(42.31 -> 42)
// res1: scala.collection.immutable.Map[Double,Int] = Map(42.31 -> 42)
// An alternative to Map((42.31, 42))

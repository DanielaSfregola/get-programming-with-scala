Map(1 -> "a", 2 -> "b").keys
// val res0: Iterable[Int] = Set(1, 2)

Map.empty[String, Int].keys
// val res1: Iterable[String] = Set()

Map(1 -> "a", 2 -> "b").values
// val res3: Iterable[String] = MapLike.DefaultValuesIterable(a, b)

Map.empty[String, Int].values
// val res4: Iterable[Int] = MapLike.DefaultValuesIterable()

Map(1 -> "a", 2 -> "b").keys
// res0: Iterable[Int] = Set(1, 2)

Map.empty[String, Int].keys
// res1: Iterable[String] = Set()

Map(1 -> "a", 2 -> "b").values
// res3: Iterable[String] = MapLike.DefaultValuesIterable(a, b)

Map.empty[String, Int].values
// res4: Iterable[Int] = MapLike.DefaultValuesIterable()

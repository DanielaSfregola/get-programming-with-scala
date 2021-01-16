Map("Rome" -> "Italy", "London" -> "UK").map {
  tuple => tuple._2 -> tuple._1
}
// res0: scala.collection.immutable.Map[String,String] = Map(Italy -> Rome, UK -> London)

Map("Rome" -> "Italy", "London" -> "UK").map {
  case (capital, country) => country -> capital
}
// res1: scala.collection.immutable.Map[String,String] = Map(Italy -> Rome, UK -> London)

Map("Rome" -> "Italy", "London" -> "UK").map {
  (capital, country) => country -> capital
}
// val res2: Map[String, String] = Map(Italy -> Rome, UK -> London)

Map("Rome" -> "Italy", "London" -> "UK").map {
  case (capital, country) => s"$capital is the capital of $country"
}
// res3: scala.collection.immutable.Iterable[String] = List(Rome is the capital of Italy, London is the capital of UK)

Map("hello" -> "world").flatten
// error: No implicit view available from (String, String) => scala.collection.IterableOnce[B].

Map(1 -> 2, 0 -> 2, 2 -> 0).flatMap { case (a, b) =>
  if (a > 0 && b > 0) Some(a -> b) else None
}
// res0: scala.collection.immutable.Map[Int,Int] = Map(1 -> 2)
// Option is automatically converted to List,
// which is an implementation of Iterable

Map(1 -> 2, 0 -> 2, 2 -> 0).flatMap { case (a, b) =>
  if (a > 0 && b > 0) Some(a * b) else None
}
// res1: scala.collection.immutable.Iterable[Int] = List(2)

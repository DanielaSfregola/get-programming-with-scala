val sqrt: PartialFunction[Int, Double] =
  { case x if x >= 0 => Math.sqrt(x) }

val zero: PartialFunction[Int, Double] = { case _ => 0 }

val value: PartialFunction[Int, Double] = { case x => x }

def sqrtOrZero(n: Int): Double =
  sqrt.orElse(zero)(n)

def sqrtOrValue(n: Int): Double =
  sqrt.orElse(value)(n)



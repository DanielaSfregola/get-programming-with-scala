def sqrt(n: Int): Option[Double] =
  if (n >= 0) Some(Math.sqrt(n)) else None

def sqrt(n: Int): Option[Double] =
  if (n >= 0) Some(Math.sqrt(n)) else None


def sqrtOrZero(n: Int): Double =
  sqrt(n) match {
    case Some(result) => result
    case None => 0
  }

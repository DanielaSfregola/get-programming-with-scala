def sqrtOrZero(n: Int): Double = n match {
  case x if x >= 0 => Math.sqrt(x)
  case _ => 0
}

def sqrtOrValue(n: Int): Double = n match {
  case x if x >= 0 => Math.sqrt(x)
  case x => x
}

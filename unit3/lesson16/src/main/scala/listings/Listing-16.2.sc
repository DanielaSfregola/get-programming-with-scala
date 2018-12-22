val sqrt: PartialFunction[Int, Double] =
  { case x if x >= 0 => Math.sqrt(x) }

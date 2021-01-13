def n(): Int =
  try {
    throw new Exception("BOOM!")
    42
  } catch {
    case ex: Exception =>
      println(s"Ignoring exception $ex. Returning zero instead")
      0
  }


n()

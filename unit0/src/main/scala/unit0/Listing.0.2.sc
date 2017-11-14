try {
  throw new IllegalStateException("BOOM!")
} catch {
  case ex :RuntimeException =>
    println("Something exploded...")
}

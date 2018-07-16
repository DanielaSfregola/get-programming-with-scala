try {
  throw new IllegalStateException("ERROR!")
} catch {
  case ex :RuntimeException =>
    println("Something went bad...")
}

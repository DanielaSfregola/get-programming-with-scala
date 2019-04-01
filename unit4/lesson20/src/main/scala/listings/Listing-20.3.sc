def stats(s: String,
          predicate: Char => Boolean = { _ => true } ): Int =
  s.count(predicate)

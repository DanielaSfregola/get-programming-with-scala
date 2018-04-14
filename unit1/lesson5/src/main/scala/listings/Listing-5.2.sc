def label(n: Int): String =
  if (n == 0) "neutral"
  else if (n < 0) "negative"
  else "positive"

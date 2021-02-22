def categorizeDayOfWeek(n: Int) = {
  if (n == 1 || n == 7) {
    "weekend"
  } else if (n > 1 && n < 7) {
    "weekday"
  } else {
    "unknown"
  }
}

for (i <- 1 to 7) println(categorizeDayOfWeek(i))

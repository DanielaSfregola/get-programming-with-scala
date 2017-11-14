package lesson5

object `5.1.CategorizeDayOfTheWeek` {

  def categorizeDayOfWeek(n: Int) = {
    if (n == 1 || n == 7) {
      "weekend"
    } else if (n > 1 && n < 7) {
      "weekday"
    } else {
      "unknown"
    }
  }

}

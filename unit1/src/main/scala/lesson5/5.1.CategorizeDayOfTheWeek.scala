package lesson5

// Listing 5.1
object CategorizeDayOfTheWeek extends App {

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

package lesson5

// Listing 5.2
object LabellingANumber extends App {

  def label(n: Int): String =
    if (n == 0) "neutral"
    else if (n < 0) "negative"
    else "positive"
}

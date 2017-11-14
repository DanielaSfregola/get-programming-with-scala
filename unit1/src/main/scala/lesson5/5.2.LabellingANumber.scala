package lesson5

object `5.2.LabellingANumber` {

  def label(n: Int): String =
    if (n == 0) "neutral"
    else if (n < 0) "negative"
    else "positive"
}

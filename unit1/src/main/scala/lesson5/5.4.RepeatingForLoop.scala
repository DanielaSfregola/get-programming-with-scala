package lesson5

// Listing 5.4
object RepeatingForLoop extends App {

  def echo5(msg: String) = {
    for (i <- 0 to 5) {
      println(msg)
    }
  }

}

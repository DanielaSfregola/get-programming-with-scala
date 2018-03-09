package lesson5

// Listing 5.3
object RepeatingWhileLoop extends App {

  def echo5(msg: String) = {
    var i = 0
    while(i < 5) {
      println(msg)
      i += 1
    }
  }
}

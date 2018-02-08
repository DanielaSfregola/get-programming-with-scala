package lesson5

// Listing 5.5
object ImplementingObjInfo extends App {

  def objInfo(param: Any) = param match {
    case n: Int if n > 0 => s"$n is a positive integer"
    case d: Double => s"$d is a double"
    case "ping" => "pong"
    case _: String => "you gave me a string"
    case obj => obj.toString
  }
  
}

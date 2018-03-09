package lesson5

// Listing 5.4
object MappingNumbersWithDaysOfTheWeek extends App {
  def toDayOfWeek(n: Int): String = n match {
    case 1 => "Sunday"
    case 2 => "Monday"
    case 3 => "Tuesday"
    case 4 => "Wednesday"
    case 5 => "Thursday"
    case 6 => "Friday"
    case 7 => "Saturday"
    case _ => "Unknown"
  }
}

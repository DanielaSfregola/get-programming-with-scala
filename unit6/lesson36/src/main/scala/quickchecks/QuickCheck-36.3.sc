// In Quick Check 36.1, you have defined a key-value data structure of type Map[Int, String]
// to represent the numbers and their corresponding days of the week.
// Use the operator -- to create a new map containing only weekdays (i.e., all but Saturday and Sunday).

// ANSWER

val days = Map(
  1 -> "Monday",
  2 -> "Tuesday",
  3 -> "Wednesday",
  4 -> "Thursday",
  5 -> "Friday",
  6 -> "Saturday",
  7 -> "Sunday"
)

val weekdays = days -- Set(6,7)
// or alternatively, you can use List: days -- List(6,7)

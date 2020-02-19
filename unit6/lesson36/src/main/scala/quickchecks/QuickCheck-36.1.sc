// Create a key-value structure of type Map[Int, String] to associate a number to
// its corresponding day of the week. For example, you should associate
// the number 1 to Monday, while 2 to Tuesday.


// ANSWER

Map(
  1 -> "Monday",
  2 -> "Tuesday",
  3 -> "Wednesday",
  4 -> "Thursday",
  5 -> "Friday",
  6 -> "Saturday",
  7 -> "Sunday"
)

// or alternatively...

Map(
  (1, "Monday"),
  (2, "Tuesday"),
  (3, "Wednesday"),
  (4, "Thursday"),
  (5, "Friday"),
  (6, "Saturday"),
  (7, "Sunday")
)

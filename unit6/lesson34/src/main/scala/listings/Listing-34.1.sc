case class Student(id: Int, name: String, topics: Set[String])

val jon = Student(
  id = 1,
  name = "Jon Snow",
  topics = Set("History", "Math")
)

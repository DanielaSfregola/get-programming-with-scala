case class Student(id: Int, name: String, topics: Set[String])

val alice = Student(
  id = 1,
  name = "Alice Abbott",
  topics = Set("History", "Math")
)

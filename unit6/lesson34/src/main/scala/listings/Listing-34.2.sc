case class Student(id: Int, name: String, topics: Set[String])

val alice = Student(
  id = 1,
  name = "Alice Abbott",
  topics = Set("History", "Math")
)

val updatedTopics = alice.topics + "History" - "Math"
alice.copy(topics = updatedTopics)

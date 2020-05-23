case class Student(id: Int, name: String, topics: Set[String])

val jon = Student(
  id = 1,
  name = "Jon Snow",
  topics = Set("History", "Math")
)

val updatedTopics = jon.topics + "History" - "Math"
jon.copy(topics = updatedTopics)

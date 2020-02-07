case class Student(id: Int, name: String, topics: Set[String])

def getTopics(students: Set[Student]): Set[String] =
  students.map(_.topics).flatten

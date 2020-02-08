case class Student(id: Int, name: String, topics: Set[String])

def existsById(students: Set[Student], id: Int): Boolean =
  students.exists(_.id == id)

def filterByTopic(students: Set[Student], topic: String): Set[Student] =
  students.filter { student =>
    student.topics.contains(topic)
  }

def maxByTopics(students: Set[Student]): Student =
  students.maxBy { student =>
    student.topics.size
  }

// Implement a function that takes a group of students and set of topics as its parameters.
// It returns a new set containing the students that are taking any of the given topics.
// Use the representation of student you have seen in this lesson:

case class Student(id: Int, name: String, topics: Set[String])


// ANSWER

def searchByTopics(students: Set[Student], topics: Set[String]): Set[Student] =
  students.filter { student =>
    val matchingTopics = student.topics intersect topics
    matchingTopics.nonEmpty
  }

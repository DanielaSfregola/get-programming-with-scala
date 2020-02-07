case class Student(id: Int, name: String, topics: Set[String])

def getTopicsForStudentIds(students: Set[Student],
                           ids: Set[Int]): Set[String] =
  for {
    student <- students
    id <- ids
    if student.id == id
    topic <- student.topics
  } yield topic

case class Student(id: Int, name: String, topics: Set[String])

def getStudentIds(students: Set[Student]): Set[String] =
  students.flatMap(_.topics)

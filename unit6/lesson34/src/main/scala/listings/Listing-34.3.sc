case class Student(id: Int, name: String, topics: Set[String])

def getIds(students: Set[Student]): Set[String] =
  students.map(_.name)

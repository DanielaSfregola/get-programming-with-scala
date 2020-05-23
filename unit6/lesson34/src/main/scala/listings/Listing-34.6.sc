case class Student(id: Int, name: String, topics: Set[String])

def getTopicsForStudentIds(students: Set[Student],
                           ids: Set[Int]): Set[String] =
  students.flatMap { student =>
    ids.flatMap { id =>
      if (student.id == id) student.topics
      else Set.empty
    }
  }

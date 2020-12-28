// Imagine you are building a program to mark exams. Assume that a mark has an exam name, a score,
// and a student id. Write a function that takes a sequence of marks and prints a human-readable
// message to the console containing the top five scores’ student id.


// ANSWER

case class Mark(exam: String, studentId: String, score: Int)

def bestPerformers(marks: List[Mark]): Unit = {
  val top = marks.sortBy(m => - m.score).take(5)
  val topStudentIds = top.map(_.studentId)
  val text = s"TOP 5 STUDENTS: \n${topStudentIds.mkString("\n")}"
  println(text)
}

// Imagine you are building a program to mark exams. Assume that a marking has an exam name,
// a score, and a student identifier. Write a function that given a sequence of scores,
// it prints to the console a human readable message containing the student identifiers of the top 5 scores.


// ANSWER

case class Mark(exam: String, studentId: String, score: Int)

def bestPerformers(marks: List[Mark]): Unit = {
  val top = marks.sortBy(m => - m.score).take(5)
  val topStudentIds = top.map(_.studentId)
  val text = s"TOP 5 STUDENTS: \n${topStudentIds.mkString("\n")}"
  println(text)
}

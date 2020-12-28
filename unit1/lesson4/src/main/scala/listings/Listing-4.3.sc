var marksSum = 0
var marksCount = 0

def averageMark: Double =
  marksSum.toDouble / marksCount

def markExam(q1: Double, q2: Double, q3: Double): Int = {
  val avgScore = (q1 + q2 + q3) / 3
  val scaledScore = avgScore * 10 / 3
  val mark = Math.round(scaledScore).toInt

  marksSum += mark
  marksCount += 1
  mark
}

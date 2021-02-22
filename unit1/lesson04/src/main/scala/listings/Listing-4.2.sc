def markExam(q1: Double, q2: Double, q3: Double) = {
  val avgScore = (q1 + q2 + q3) / 3
  val scaledScore = avgScore * 10 / 3
  Math.round(scaledScore)
}

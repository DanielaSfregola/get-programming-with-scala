case class Pass(score: Int) {
  require(score >= 60 && score <= 100,
    "Invalid pass: score must be between 60 and 100")

  def toPercentage: Double = score / 100.0
}

def toPercentageScore(outcome: Either[String, Pass]): Either[String, Double] =
  outcome.right.map(_.toPercentage)

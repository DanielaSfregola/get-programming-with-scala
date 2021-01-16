case class Pass(score: Int) {
  require(score >= 60 && score <= 100,
    "Invalid pass: score must be between 60 and 100")
}

def combine(outcomeA: Either[String, Pass],
            outcomeB: Either[String, Pass]): Either[String, Pass] =
  for {
    passA <- outcomeA
    passB <- outcomeB
  } yield {
    val averageScore = (passA.score + passB.score) / 2
    Pass(averageScore)
  }

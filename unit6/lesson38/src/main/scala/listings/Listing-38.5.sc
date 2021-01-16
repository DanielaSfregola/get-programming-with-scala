case class Pass(score: Int) {
  require(score >= 60 && score <= 100,
    "Invalid pass: score must be between 60 and 100")
}

def combine(outcomeA: Either[String, Pass],
            outcomeB: Either[String, Pass]): Either[String, Pass] = {
  outcomeA.flatMap { passA =>
    outcomeB.map { passB =>
      val averageScore = (passA.score + passB.score) / 2
      Pass(averageScore)
    }
  }
}

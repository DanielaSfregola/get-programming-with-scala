case class Pass(score: Int) {
  require(score >= 60 && score <= 100,
    "Invalid pass: score must be between 60 and 100")
}

def isPass(outcome: Either[String, Pass]): Boolean =
  outcome.isRight

def isDistinction(outcome: Either[String, Pass]): Boolean =
  outcome.exists(pass => pass.score >= 80)



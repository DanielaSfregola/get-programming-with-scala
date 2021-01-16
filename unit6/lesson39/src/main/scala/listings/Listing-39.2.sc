case class Pass(score: Int) {
  require(score >= 60 && score <= 100,
    "Invalid pass: score must be between 60 and 100")
}

def getPreviewMessage(outcome: Either[String, Pass]): String =
  outcome.left.getOrElse("You passed the exam, well done!")


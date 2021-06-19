case class Pass(score: Int) {
  require(score >= 60 && score <= 100,
          "Invalid pass: score must be between 60 and 100")
}

def toMessage(outcome: Either[String, Pass]): String =
  outcome match {
    case Left(msg) => s"Fail: $msg"
    case Right(pass) => s"Pass with score ${pass.score}"
  }

case class Pass(score: Int) {
  require(score >= 60 && score <= 100,
          "Invalid pass: score must be between 60 and 100")
}

def mark(score: Int, msg: Option[String] = None): Either[String, Pass] =
  if (score >= 60) Right(Pass(score))
  else Left(msg.getOrElse("Score below 60"))

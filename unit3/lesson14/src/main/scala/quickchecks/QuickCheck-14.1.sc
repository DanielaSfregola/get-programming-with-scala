// Consider the function objInfo shown in listing 13.3.Guess the type and value
// that the function returns for the following inputs.
// Use the REPL to validate your hypotheses.


// ANSWER

def objInfo(param: Any) = param match {
  case n: Int if n > 0 => s"$n is a positive integer"
  case d: Double => s"$d is a double"
  case "ping" => "pong"
  case _: String => "you gave me a string"
  case obj => obj.toString
}


objInfo(-1)
// val res0: String = -1

objInfo(true)
// val res1: String = true

objInfo(200)
// val res2: String = 200 is a positive integer

objInfo(200.00)
// val res3: String = 200.0 is a double

objInfo("ping")
// val res4: String = pong

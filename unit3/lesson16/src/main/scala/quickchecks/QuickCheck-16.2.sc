// Consider the partial functions sqrt and zero in listing 15.4:
// is the partial function sqrt.orElse(zero) equivalent to zero.orElse(sqrt)?

val sqrt: PartialFunction[Int, Double] =
{ case x if x >= 0 => Math.sqrt(x)}

val zero: PartialFunction[Int, Double] = { case _ => 0 }


// ANSWER
// The two partial functions are not equivalent because of their composition order:
// differently from sqrt.orElse(zero)(4), the function zero.orElse(sqrt)
// returns zero for any input.

sqrt.orElse(zero)(4) 	// returns 2.0
zero.orElse(sqrt)(4) 	// returns 0.0

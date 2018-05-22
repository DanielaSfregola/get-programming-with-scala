// Rewrite each of the following functions as anonymous functions:
// use your concise notation at your discretion.


// 1.
def multiply(s: String, n: Int): Int = s.length * n

// ANSWER:
val multiply = { (s: String, n: Int) => s.length * n }


// 2.
def toDouble(n: Int): Double = n.toDouble

// ANSWER:
val toDouble: Int => Double = _.toDouble


// 3.
def concat(s1: String, s2: String): String = s1 + s2

// ANSWER:
val concat: (String, String) => String = _ + _


// 4.
def invertseConcat(s1: String, s2: String): String = s2 + s1

// ANSWER:
val inverseConcat = { (s1: String, s2: String) => s2 + s1 }


//5.
def myLongFunc(s: String): String = {
  val length = s.length
  s.reverse * length
}

// ANSWER:
val myLongFunc = { s: String =>
  val length = s.length
  s.reverse * length
}

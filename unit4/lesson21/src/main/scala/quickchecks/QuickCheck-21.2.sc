// Which ones of the following functions have side effects? Why

// 1.
def div(a: Int, b: Int): Int = {
  if (b == 0) throw new Exception("Cannot divide by zero")
  else a / b
}

// 2.
case class User(id: Int, age: Int)
def getUser(id: Int): User = ???

def getUserAge(id: Int): Int = {
  val user = getUser(id) // gets data for a database
  user.age
}

// 3.
def powerOf2(d: Double): Double = Math.pow(2, d)


// 4.
def anotherPowerOf2(d: Double): Double = {
  println(s"Computing 2^$d...")
  Math.pow(2, d)
}

// 5.
def getCurrentTime(): Long = System.currentTimeMillis()

// ANSWERS
// The answers are the following:
// 1.	The function div has no side effects: throwing exceptions is not a side effect
//    as it does not change the state of components external to the function.
// 2.	The function getUserAge will return different results depending on which objects
//    are stored in the database, so it has a (read) side effect.
// 3.	The function powerOf2 has no side effects as its return value depends entirely on its input.
// 4.	The function anotherPowerOf2 has a (write) side effects: every time you call it,
//    it produces a new message to the console, changing its state.
// 5.	The function getCurrentTime returns a value that depends on the internal clock of
//    your machine, so it has a (read) side effect.

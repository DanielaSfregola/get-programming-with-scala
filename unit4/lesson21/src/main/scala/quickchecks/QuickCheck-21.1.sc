// Which of the following functions are total? Why?
// 1.
def opsA(n: Int): Int = if(n <= 0) n else n + 1

// 2.
def opsB(n: Int): Int = if(n <= 0) n else opsB(n + 1)

// 3.
def selectException(predicate: Boolean): Exception =
  if (predicate) new IllegalStateException("msg here")
  else new ArithmeticException("another msg here")

// 4.
def anotherToString(obj: AnyRef): String = {
  Thread.sleep(1000 /* millis */ )
  obj.toString
}

// 5.
def validateDistance(dist: Double): Double =
  if (dist < 0) {
    throw new IllegalStateException("Distance cannot be negative")
  } else dist


// ANSWERS
// The answers are as follows:
// 1.	The function opsA is total because it always terminates and for every integer,
//    it returns an integer.
// 2.	The function opsB is not total: for positive integers, it keeps calls itself
//    recursively and never terminates.
// 3.	The function selectException is total because it returns an instance of exception:
//    for every input it computes a value that matches its return type.
//    The keyword throw is missing, so the function does not throw the exception,
//    but it returns it as a class instance.
// 4.	The function anotherToString is total: for every input, it eventually terminates after
//    sleeping for 1 second (or 1000 milliseconds) and returning a string.
//    What if the function was to block for a much more extended period (e.g., ten years),
//    would you still consider it total?
// 5.	The function validateDistance is not total because it throws an exception for
//    any negative double number.

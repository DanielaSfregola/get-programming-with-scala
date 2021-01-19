// In Scala 2: def welcome(name: String)(implicit msg: String): Unit
def welcome(name: String)(using msg: String): Unit =
  println(s"$msg, $name!")
// welcome: (name: String)(using msg: String)Unit
// the function welcome requires an implicit parameter of type String

// In Scala 2: welcome("Jane")("Hello")
welcome("Jane")(using "Hello")
// Hello, Jane!
// You need to provide the keyword using when passing an implicit parameter
// explicitly in Scala 3. You do not need to pass any keyword in Scala 2.

welcome("Jane")
// <console>:13: no implicit argument of type String was found for parameter msg of method welcome
//  ^
// You didn’t provide a value for msg, so the compiler searches one to use.
// It fails to find one (there are no implicit elements!)

val hi = "Hi"
// hi: String = Hello

welcome("Jane")
// <console>:13: no implicit argument of type String was found for parameter msg of method welcome
//  ^
// The compiler does not detect hi as a valid match
// because it is not marked as given (or implicit in Scala 2).

// In Scala 2: implicit val hi2 = "Hi"
given hi2: String = "Hi"
// def hi2: String = Hi

welcome("Jane")
// Hi, Jane!
// The compiler passes the value hi2 implicitly

// In Scala 2: implicit val hola = "Hola"
given hola: String = "Hola"
// def hola: String = Hola
welcome("Jane")
// <console>:15: error: ambiguous implicit arguments: both method hola and method hi match type String of parameter msg of method welcome
// The compiler finds two values of type String
// and it cannot pick one unambiguously.

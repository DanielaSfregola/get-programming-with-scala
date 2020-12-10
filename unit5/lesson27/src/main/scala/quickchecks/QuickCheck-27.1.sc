// Using the Scala REPL, create a list containing the number 42 and the nullable string “0”.
// What is the type of your List instance? Why?


// ANSWER

// You can create the list my typing the following instruction in the Scala REPL:

42 :: Some("scala") :: Nil

// Or alternatively:

List(42, Some("scala"))

// The list has type List[Any] because Any is the most specific type to represent both Int and Option[String].

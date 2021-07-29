// The function scala.io.StdIn.readLine() allows you to read text from the terminal.
// Implement a function called read to describe this side effect using the type IO.
// Use the Scala REPL to execute it and type your name.


// ANSWER

import cats.effect.IO

def read: IO[String] = IO(scala.io.StdIn.readLine())

read.unsafeRunSync()
// the cursor waits for you to type,
// and it returns it after you press the enter key.
// val res0: String = Daniela

// Write an anonymous function equivalent to the following function:

def hello(n: String): String = s"Hello, $n!"


// ANSWER

{ n: String => s"Hello, $n!" }

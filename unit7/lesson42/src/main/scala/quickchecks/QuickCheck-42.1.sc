// Consider the following snippet of code. Does it compile? If not, how would you fix it?

// In Scala 2, use the keyword 'implicit' instead of 'using'
def plusOne(using n: Int): Int = n + 1
plusOne(3)


// ANSWER

// The code compiles, and it returns 4. The compiler doesn’t search for an implicit parameter
// because you provided a value for it explicitly.

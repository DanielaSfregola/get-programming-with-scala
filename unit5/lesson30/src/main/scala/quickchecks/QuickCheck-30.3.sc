// Consider your address book program and the following snippet of code:
//
// def topContact(addressBook: List[Contact]): Contact =
//   addressBook.max
//
// Does it compile? What does it return? Why? Use the REPL to validate your hypothesis.


// ANSWER

// The code does not compile because the compiler does not know it should order a sequence of contacts.
// It errors with the following message: “No implicit Ordering defined for Contact.”.
// You can solve this by using the maxBy function and providing an explicit ordering rule.
// You could also define a natural ordering for contacts: you are going to learn how to do this
// later on in the book when you are going to discover about implicits.


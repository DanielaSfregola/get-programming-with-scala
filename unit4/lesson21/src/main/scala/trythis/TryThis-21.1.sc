// Which ones of the following functions are pure? Which ones are impure?

class User
def insertUser(user: User): Unit = ???
def selectUser(id: Int): User = ???

// 1.
def welcome(n: String): String = s"Welcome $n!"

// 2.
def printWelcome(n: String): Unit =
  println(s"Welcome $n!")

// 3.
def slowMultiplication(a: Int, b: Int): Int = {
  Thread.sleep(1000) // 1 second
  a * b
}

// 4.
def saveUser(user: User): User = {
  insertUser(user) // inserts in a database
  user
}

// 5.
def getUser(id: Int): User = {
  selectUser(id) // searches in a database
}


// ANSWERS

// 1. Pure
// 2. Impure
// 3. Pure
// 4. Impure
// 5. Impure

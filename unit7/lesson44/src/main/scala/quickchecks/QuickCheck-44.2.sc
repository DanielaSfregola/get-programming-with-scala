// Consider the following snippet of code:

import scala.concurrent.{ExecutionContext, Future}

case class Account(id: String)
case class User(name: String)

def getAccount(orderId: Int)
              (using ec: ExecutionContext): Future[Account] = ???

def getUser(accountId: String)
           (using ec: ExecutionContext): Future[User] = ???

// Use the functions getAccount and getUser to create a new function that will return
// the user associated with an order id. This function should have the following signature:

// def getUser(orderId: Int)(using ec: ExecutionContext): Future[User]


// ANSWER

def getUser(orderId: Int)(using ec: ExecutionContext): Future[User] =
  getAccount(orderId).map(account => getUser(account.id)).flatten

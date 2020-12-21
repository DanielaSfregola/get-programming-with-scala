// In quick check 44.2, you have implemented a function getUser(orderId: Int) using the function flatten: refactor it to use the flatMap method instead.


// ANSWER

import scala.concurrent.{ExecutionContext, Future}

case class Account(id: String)
case class User(name: String)

def getAccount(orderId: Int)
              (using ec: ExecutionContext): Future[Account] = ???

def getUser(accountId: String)
           (using ec: ExecutionContext): Future[User] = ???

def getUser(orderId: Int)(using ec: ExecutionContext): Future[User] =
  getAccount(orderId).flatMap(account => getUser(account.id))

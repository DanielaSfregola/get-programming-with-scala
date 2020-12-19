case class User(id: Int)
case class UserContext(id: Int, details: PersonalDetails, account: Account)
case class ProductSelection(productIds: List[Int])

case class PersonalDetails(/* some fields here */)
case class Account(/* some fields here */)

def purchase(userId: Int, selection: ProductSelection): Either[String, Int] = {
  // In Scala 2: implicit val userContext: UserContext = getUserContext(userId)
  given userContext: UserContext = getUserContext(userId)
  for {
    _ <- validateAddressWithinDistance
    _ <- validateSelection(selection)
    _ <- validateBalance(selection)
  } yield placeOrder(selection)
}

private def getUserContext(userId: Int): UserContext = ???

// In Scala 2, use the keyword 'implicit' instead of 'using'
private def validateBalance(selection: ProductSelection)
                           (using userContext: UserContext): Either[String, Double] = ???

// In Scala 2, use the keyword 'implicit' instead of 'using'
 private def validateAddressWithinDistance(
              using userContext: UserContext): Either[String, UserContext] = ???

// In Scala 2, use the keyword 'implicit' instead of 'using'
 private def validateSelection(selection: ProductSelection)
                             (using userContext: UserContext): Either[String, ProductSelection] = ???

// In Scala 2, use the keyword 'implicit' instead of 'using'
 private def placeOrder(selection: ProductSelection)
                      (using userContext: UserContext): Int = ???

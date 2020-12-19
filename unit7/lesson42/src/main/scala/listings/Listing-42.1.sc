case class User(id: Int)
case class UserContext(id: Int, details: PersonalDetails, account: Account)
case class ProductSelection(productIds: List[Int])

case class PersonalDetails(/* some fields here */)
case class Account(/* some fields here */)

def purchase(userId: Int, selection: ProductSelection): Either[String, Int] = {
  val userContext = getUserContext(userId)
  for {
    _ <- validateAddressWithinDistance(userContext)
    _ <- validateSelection(selection, userContext)
    _ <- validateBalance(selection, userContext)
  } yield placeOrder(selection, userContext)
}

private def getUserContext(userId: Int): UserContext = ???

private def validateBalance(
             selection: ProductSelection, userContext: UserContext):
                                              Either[String, Double] = ???

private def validateAddressWithinDistance(
              userContext: UserContext): Either[String, UserContext] = ???

private def validateSelection(
             selection: ProductSelection, userContext: UserContext):
                                        Either[String, ProductSelection] = ???

private def placeOrder(
              selection: ProductSelection, userContext: UserContext): Int = ???

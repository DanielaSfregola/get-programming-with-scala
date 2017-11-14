package lesson8

class VendingMachine {

  private var chocolateBar = 0
  private var granolaBar = 0

  private[lesson8] var totalMoney = 0.0

  def buy(product: String, money: Double): String =
    if(!isProductAvailable(product)) s"Sorry, product $product not available"
    else if (!isMoneyEnough(product, money)) "Please, insert more money"
    else completeRequest(product, money)

  private def isProductAvailable(product: String): Boolean = {
    val productQuantity = product.toLowerCase match {
      case "chocolate" => chocolateBar
      case "granola" => granolaBar
      case _ => -1
    }
    productQuantity > 0
  }

  private def isMoneyEnough(product: String, money: Double): Boolean =
    product.toLowerCase match {
      case "chocolate" => money >= 1.5
      case "granola" => money >= 1
    }

  private def completeRequest(product: String, money: Double): String = {
    collectMoney(money)
    releaseProduct(product)
    s"There you go!"
  }

  private def collectMoney(money: Double) =
    totalMoney += money

  private def releaseProduct(product: String) =
    product.toLowerCase match {
    case "chocolate" => chocolateBar -= 1
    case "granola" => granolaBar -= 1
  }

  private[lesson8] def refillProducts(chocolate: Int, granola: Int): String = {
    chocolateBar += chocolate
    granolaBar += granola
    s"""Products added. We now have :
      | - $chocolateBar chocolate bars
      | - $granolaBar granola bars
    """.stripMargin
    }
}

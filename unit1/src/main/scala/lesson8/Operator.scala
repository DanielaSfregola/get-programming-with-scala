package lesson8

class Operator(machine: VendingMachine) {

  def collectMoney: String = {
    val collectedMoney = machine.totalMoney
    machine.totalMoney = 0
    s"I have collected $collectedMoney"
  }

  def refillProducts(chocolate: Int, granola: Int): String =
    machine.refillProducts(chocolate, granola)

}

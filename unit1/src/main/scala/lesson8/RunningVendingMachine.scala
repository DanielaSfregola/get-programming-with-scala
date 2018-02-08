package lesson8

object RunningVendingMachine extends App {

  val machine = new VendingMachine
  println(machine.buy("chocolate", 1.5))

  val operator = new Operator(machine)
  println(operator.refillProducts(2, 1))

  machine.buy("chocolate", 1.5)
  machine.buy("chocolate", 1)
  machine.buy("granola", 2)
  machine.buy("granola", 2)

  operator.collectMoney

}

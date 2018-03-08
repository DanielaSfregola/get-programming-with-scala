package lesson8

object RunningVendingMachine {

  def main(args: Array[String]): Unit = {
    val machine = new VendingMachine

    println(machine.buy("chocolate", 1.5))
    println(machine.buy("granola", 2))

    machine.granolaBar = 10
    machine.chocolateBar = 2

    println(machine.buy("chocolate", 1))
    println(machine.buy("granola", 2))

    println(s"Total money collected: ${machine.totalMoney} USD")
  }
}

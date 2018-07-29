object Main extends App {

  val machine = new VendingMachine

  println(machine.buy("chocolate", 1.5))

  println(machine.chocolateBar)
  println(machine.granolaBar)

  machine.chocolateBar += 2
  machine.granolaBar += 1

  println(machine.buy("chocolate", 1.5))

  println(machine.buy("chocolate", 1))

  println(machine.buy("granola", 2))
  println(machine.buy("granola", 2))

  println(machine.totalMoney)
}

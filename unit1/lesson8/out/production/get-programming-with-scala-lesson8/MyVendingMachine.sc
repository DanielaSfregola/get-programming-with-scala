val machine = new VendingMachine

machine.buy("chocolate", 1.5)

machine.chocolateBar
machine.granolaBar

machine.chocolateBar = 2
machine.granolaBar = 1

machine.buy("chocolate", 1.5)

machine.buy("chocolate", 1)

machine.buy("granola", 2)
machine.buy("granola", 2)

machine.totalMoney

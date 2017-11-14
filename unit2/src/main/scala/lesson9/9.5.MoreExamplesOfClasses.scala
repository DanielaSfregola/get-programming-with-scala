package lesson9

object `9.5.MoreExamplesOfClasses` {

  class Brewery

  class Beer(name: String, brewery: Brewery) {
    def pourInGlass() = ???
  }

  val brewDog = new Brewery
  val deadPonyClub = new Beer("Dead Pony Club", brewDog)
  deadPonyClub.pourInGlass()
}

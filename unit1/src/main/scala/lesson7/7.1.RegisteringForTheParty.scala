package lesson7

object `7.1.RegisteringForTheParty` {

  class Party {

    var attendees = 0

    def register(guests: Int) =
      attendees += guests

  }

}

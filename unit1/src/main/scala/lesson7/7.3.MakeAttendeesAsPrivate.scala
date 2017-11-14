package lesson7

object `7.3.MakeAttendeesAsPrivate` {

  class Party {

    private var attendees = 0

    def register(guests: Int) =
      attendees += guests

  }

}

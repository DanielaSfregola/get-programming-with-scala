class Event {

  protected def estimateCosts(attendees: Int): Double =
    if (attendees < 10) 50.00 else attendees * 12.34
}

class Party extends Event {

  private var attendees = 0

  def cost = estimateCosts(attendees)

  def register(guests: Int) =
    attendees += guests
}

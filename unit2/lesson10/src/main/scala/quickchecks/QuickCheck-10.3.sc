// Can you access the function estimateCosts from outside the class Event?
// Use the REPL to validate your hypothesis.


class Event {

  protected def estimateCosts(attendees: Int): Double =
    if (attendees < 10) 50.00 else attendees * 12.34
}

class Party extends Event {

  private var attendees = 0

  var cost = estimateCosts(attendees)

  def register(guests: Int) =
    attendees += guests
}

val event = new Event
event.estimateCosts(5)

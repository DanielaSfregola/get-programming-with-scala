// Can you access the function estimateCosts from outside the class Event?
// Use the REPL to validate your hypothesis.


// ANSWER

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

val event = new Event
event.estimateCosts(5) // doesn't compile: it is not accessible!

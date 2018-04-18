// Can you access the function estimateCosts from outside the class CostEstimator?
// Use the REPL to validate your hypothesis.


class CostEstimator {

  protected def estimateCosts(attendees: Int): Double =
    if (attendees < 10) 50.00 else attendees * 12.34
}

class Party extends CostEstimator {

  private var attendees = 0

  var cost = estimateCosts(attendees)

  def register(guests: Int) =
    attendees += guests
}

val estimator = new CostEstimator
estimator.estimateCosts(5)

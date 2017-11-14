package lesson7

object `7.5.ImplementingCostEstimator` {

  class CostEstimator {

    protected def estimateCosts(attendees: Int): Double =
      if (attendees < 10) 50.00 else attendees * 12.34
  }

  class Party extends CostEstimator {

    private var attendees = 0

    def register(guests: Int) =
      attendees += guests

  }
}

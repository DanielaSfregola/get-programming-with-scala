package lesson18

trait CostEstimator {

  def estimateCosts(rental: Rental,
                    segment: Segment): Double = {
    val rentalCost = estimateRentalCost(rental, segment)
    val gasCost = estimateGasCost(rental, segment)
    rentalCost + gasCost
  }

  private def estimateRentalCost(rental: Rental,
                                 segment: Segment): Double = {
    val insurance = rental.insuranceCost
    val totalRent = segment.duration.toDays * rental.costPerDay
    totalRent + insurance
  }

  private def estimateGasCost(rental: Rental,
                              segment: Segment): Double = {
    val costPerKm: FuelType => Double =
      segment.gasCost.costPerKm(_, rental.kmPerLitre)
    costPerKm(rental.fuelType) * segment.distanceInKm
  }
}

package lesson18

import scala.concurrent.duration._

object TripEstimator extends CostEstimator {

  val uk = GasCost(petrolPerLiter = 1.25, dieselPerLiter = 1.20)
  val france = GasCost(petrolPerLiter = 1.35, dieselPerLiter = 1.25)
  val switzerland = GasCost(petrolPerLiter = 1.38, dieselPerLiter = 1.23)
  val germany = GasCost(petrolPerLiter = 1.40, dieselPerLiter = 1.14)
  val italy = GasCost(petrolPerLiter = 1.65, dieselPerLiter = 1.50)

  val london = Segment("London", uk, 5 days, 464)
  val paris = Segment("Paris", france, 4 days, 603)
  val zurich = Segment("Zurich", switzerland, 3 days, 315)
  val munich = Segment("Munich", germany, 3 days, 543)
  val venice = Segment("Venice", italy, 4 days, 526)
  val rome = Segment("Rome", italy, 5 days, 120)

  def estimateTripCosts(rental: Rental): Double = {
    estimateCosts(rental, london) +
      estimateCosts(rental, paris) +
      estimateCosts(rental, zurich) +
      estimateCosts(rental, munich) +
      estimateCosts(rental, venice) +
      estimateCosts(rental, rome)
  }

  val toyota = Rental("Toyota Rav", Diesel, kmPerLitre = 16, costPerDay = 50, insuranceCost = 50)

  val honda = Rental("Honda CR-V", Petrol, kmPerLitre = 10, costPerDay = 40, insuranceCost = 0)

}

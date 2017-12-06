package lesson18

case class GasCost(petrolPerLiter: Double, dieselPerLiter: Double) {

  def costPerKm(fuelType: FuelType, kmPerLiter: Double): Double = {
    val costPerLiter = fuelType match {
      case Petrol => petrolPerLiter
      case Diesel => dieselPerLiter
    }
    costPerLiter / kmPerLiter
  }

}

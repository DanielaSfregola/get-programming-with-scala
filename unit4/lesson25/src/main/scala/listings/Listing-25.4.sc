case class NutritionFacts(
   totalFat: Double, /* grams */
   saturatedFat: Double, /* grams */
   sugars: Double, /* grams */
   salt: Double /* grams */
)

class Drink(
  name: String,
  brand: String,
  size: Double /* milliliter */) {

  def loadNutritionFacts(): NutritionFacts = ???
}

object Drink {

  def unapply(drink: Drink): Option[(Double, Double)] = {
    val nutritionFacts = drink.loadNutritionFacts()
    Some((nutritionFacts.saturatedFat, nutritionFacts.sugars))
  }
}

sealed trait Label
case object LowSaturatedFatAndSugar extends Label
case object LowSaturatedFat extends Label
case object LowSugar extends Label
case object HighSaturatedFatAndSugar extends Label

val fatThreshold: Double = ???
val sugarThreshold: Double = ???

def analyze(drink: Drink): Label = drink match {
  case Drink(fat, sugar)
    if fat < fatThreshold &&
    sugar < sugarThreshold => LowSaturatedFatAndSugar
  case Drink(fat, _) if fat < fatThreshold  => LowSaturatedFat
  case Drink(_, sugar) if sugar < sugarThreshold  => LowSugar
  case _  => HighSaturatedFatAndSugar
}


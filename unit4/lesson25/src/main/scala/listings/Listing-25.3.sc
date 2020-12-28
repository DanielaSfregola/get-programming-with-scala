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

sealed trait Label
case object LowSaturatedFatAndSugar extends Label
case object LowSaturatedFat extends Label
case object LowSugar extends Label
case object HighSaturatedFatAndSugar extends Label

val saturatedFatThreshold: Double = ???
val sugarThreshold: Double = ???

def analyze(drink: Drink): Label = drink.loadNutritionFacts() match {
  case NutritionFacts(_, saturatedFat, sugar, _)
    if saturatedFat < saturatedFatThreshold &&
       sugar < sugarThreshold => LowSaturatedFatAndSugar
  case NutritionFacts(_, saturatedFat, _, _)
    if saturatedFat < saturatedFatThreshold  => LowSaturatedFat
  case NutritionFacts(_, _, sugar, _)
    if sugar < sugarThreshold  => LowSugar
  case _  => HighSaturatedFatAndSugar
}

enum Country(val code: String) {
  case Italy extends Country("IT")
  case UnitedKingdom extends Country("UK")
  case UnitedStates extends Country("US")
  case Japan extends Country("JP")
}


Country.Italy.code

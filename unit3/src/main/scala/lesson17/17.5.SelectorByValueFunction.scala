package lesson17

// Listing 17.5
object SelectorByValueFunction extends App {

  def selectorByValue(opA: Int, opB: Int, flag: Boolean): Int =
    if (flag) opA else opB

}


package lesson17

// Listing 17.6
object SelectorByValueAndNameFunctions extends App {

  def selectorByValue(opA: Int,
                      opB: Int,
                      flag: Boolean): Int =
    if (flag) opA else opB

  def selectorByName(opA: => Int,
                     opB: => Int,
                     flag: Boolean): Int =
    if (flag) opA else opB

}


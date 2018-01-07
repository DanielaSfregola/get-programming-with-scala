package lesson17

object `17.6.SelectorByValueAndNameFunctions` {

  def selectorByValue(opA: Int,
                      opB: Int,
                      flag: Boolean): Int =
    if (flag) opA else opB

  def selectorByName(opA: => Int,
                     opB: => Int,
                     flag: Boolean): Int =
    if (flag) opA else opB
  
}


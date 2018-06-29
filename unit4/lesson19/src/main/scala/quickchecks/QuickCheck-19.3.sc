// Consider the code you have seen in listing 18.4.
// Modify the implementation of USD to define three more currencies using case objects: GBP, CAD, and EUR.
// Use a sealed trait to group them all as currency.


sealed trait Currency
case object USD extends Currency
case object GBP extends Currency
case object CAD extends Currency
case object EUR extends Currency

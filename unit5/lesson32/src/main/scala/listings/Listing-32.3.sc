sealed trait Label
case object Work extends Label
case object Home extends Label

case class ContactNumber(number: String, label: Label)

case class Contact(name: String,
                   surname: String,
                   numbers: List[ContactNumber],
                   company: Option[String],
                   email: Option[String]) {

  def toPrettyString: String = s"$surname $name"
}

def describeFirstN(n: Int, addressBook: List[Contact]): String =
  addressBook.take(n).map(_.toPrettyString).mkString("\n")

case class Contact(name: String, surname: String, number: String)

def getSurnames(contacts: List[Contact]): List[String] = contacts match {
  case Nil => Nil
  case head :: tail => head.surname :: getSurnames(tail)
}

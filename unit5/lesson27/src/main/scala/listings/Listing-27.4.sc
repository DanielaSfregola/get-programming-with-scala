case class Contact(name: String, surname: String, number: String)

def validateContacts(contacts: List[Contact]): List[Contact] =
  contacts match {
    case List() =>
      throw new IllegalStateException(
        "Invalid empty address book! " +
        "Please provide at least two contacts")
    case List(a) =>
      throw new IllegalStateException(
        s"Only contact ${a.name} ${a.surname} found. " +
        s"Please provide at least another one")
    case cs => cs
  }

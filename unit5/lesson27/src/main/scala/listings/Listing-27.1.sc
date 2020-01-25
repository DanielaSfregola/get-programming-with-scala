case class Contact(name: String, surname: String, number: String)

val martin = Contact(name = "Martin",
                     surname = "Odersky",
                     number = "+123456789")

val daniela = Contact(name = "Daniela",
                      surname = "Sfregola",
                      number = "+987654321")

val contacts = List(martin, daniela)

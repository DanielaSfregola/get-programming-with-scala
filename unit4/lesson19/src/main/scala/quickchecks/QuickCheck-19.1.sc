//Define case classes to express the following relations:
//-	a brewery has a name
//-	a beer has a name and a brewery

case class Brewery(name: String)
case class Beer(name: String, brewery: Brewery)

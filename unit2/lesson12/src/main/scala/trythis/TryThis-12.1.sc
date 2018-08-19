// Implement an interface to ensure the presence of a field color.
// Define two classes that conform to your interface: one to represent furniture, the other clothes.


trait Color {

  def color: String
}

class Furniture(val color: String) extends Color

class Clothing(val size: Int, val color: String) extends Color

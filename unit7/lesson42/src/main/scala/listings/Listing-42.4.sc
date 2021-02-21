case class Order(id: Int)

object Order {
  // In Scala 2: implicit val ordering: Ordering[Order] = new Ordering[Order] {
  given ordering: Ordering[Order] with {
    override def compare(x: Order, y: Order): Int =
      - x.id.compare(y.id)
  }
}

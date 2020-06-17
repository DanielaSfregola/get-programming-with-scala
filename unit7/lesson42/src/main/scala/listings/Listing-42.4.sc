case class Order(id: Int)

object Order {
  implicit val ordering: Ordering[Order] = new Ordering[Order] {
    override def compare(x: Order, y: Order): Int =
      - x.id.compare(y.id)
  }
}

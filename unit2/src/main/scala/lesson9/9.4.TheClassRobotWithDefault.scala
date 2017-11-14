package lesson9

object `9.4.TheClassRobotWithDefault` {

  class Robot(val name: String = "Unknown")

  val noName = new Robot

  noName.name
}

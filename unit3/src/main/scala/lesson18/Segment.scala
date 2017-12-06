package lesson18

import scala.concurrent.duration.Duration

case class Segment(name: String,
                   gasCost: GasCost,
                   duration: Duration,
                   distanceInKm: Int)

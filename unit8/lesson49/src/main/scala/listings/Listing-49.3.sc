class Stats(playerId: Long) {
  /* some meaningful stats loaded here */

  // Sleeping here to simulate a slow operation
  Thread.sleep(10000) // 10 seconds
}

class Player(id: Long, name: String) {
  val stats: Stats = new Stats(id)
}


import java.time._
val start = Instant.now()
val daniela = new Player(1, "Daniela")
val duration = Duration.between(start, Instant.now())
println(s"Took ${duration.getSeconds} seconds!")

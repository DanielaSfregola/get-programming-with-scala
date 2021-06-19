class Stats(playerId: Long) {
  /* some meaningful stats loaded here */

  // Sleeping here to simulate a slow operation
  Thread.sleep(10000) // 10 seconds
}

class Player(id: Long, name: String) {
  lazy val stats: Stats = new Stats(id)
}


import java.time._
val startA = Instant.now()
val alice = new Player(1, "Alice")
val durationA = Duration.between(startA, Instant.now())
println(s"Took ${durationA.getSeconds} seconds!")


import java.time._
val startB = Instant.now()
alice.stats
val durationB = Duration.between(startB, Instant.now())
println(s"Took ${durationB.getSeconds} seconds!")

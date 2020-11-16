import cats.effect.IO

class Stats(playerId: Long) {
  /* some meaningful stats loaded here */
  println(s"Loading statistics for player $playerId...")

  // Sleeping here to simulate a slow operation
  Thread.sleep(10000) // 10 seconds
}

object Stats {

  def load(playerId: Long): IO[Stats] = IO.async { callback =>
    val either: Either[Throwable, Stats] = Right(new Stats(playerId))
    callback(either)
  }

}


val myStats = Stats.load(1)
myStats.unsafeRunAsync {
  case Left(ex) => println(s"Error: $ex")
  case Right(_) => println(s"Success!")
}

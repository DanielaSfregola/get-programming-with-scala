// Imagine you are developing a rating system program for movies. Each movie has a title,
// a director, its publication year, a short description, and a list of awards it received.
// Write a function to find the most recent production with the most awards.


// ANSWER

case class Movie(title: String, director: String, year: Int, description: String, awards: List[String])

def mostAwards(movies: List[Movie]): Movie =
  movies.maxBy { movie =>
    (movie.awards.size, movie.year)
  }

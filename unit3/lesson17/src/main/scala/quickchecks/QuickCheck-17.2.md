Add a new endpoint to your PingService to match a GET request with a /ping/<name> URI: 
it should return a string containing “pong” followed by the value passed in the path.



ANSWER:

Implement an addition case statement for the partial function that defines your HttpService:

case GET -> Root / "ping" / name => Ok(s"pong $name")

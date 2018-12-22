Suppose you’d like your PingService to match a request with a /ping URI, 
but with any HTTP method (i.e., GET, POST, PUT, DELETE, PATCH). How would you change your code?


ANSWER:

You can change your partial function to match any HTTP method of an incoming request by using the underscore symbol as follows:

case _ -> Root / "ping" => Ok("pong")

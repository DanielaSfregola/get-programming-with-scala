Change your code not to provide a host or port for your server by invoking the function bindHttp 
without parameters. What happens when you start your application using the command sbt run?


ANSWER:

The function bindHttp uses predefined defaults when invoked with no parameters. 
It binds the server to host 127.0.0.1 and port 8080: 

[info] running org.example.ping.PingApp 
Service bound to address /127.0.0.1:8080 

  _   _   _        _ _
 | |_| |_| |_ _ __| | | ___
 | ' \  _|  _| '_ \_  _(_-<
 |_||_\__|\__| .__/ |_|/__/
             |_| 
http4s v0.21.9 on blaze v0.14.14 started at http://127.0.0.1:8080/

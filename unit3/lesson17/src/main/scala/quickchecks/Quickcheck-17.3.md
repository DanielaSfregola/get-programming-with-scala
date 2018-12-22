Remove the scala.concurrent.ExecutionContext.Implicits.global import.
What happens when you try to compile your code?


ANSWER:

The application needs a set of threads to run the HTTP server, but the compiler cannot find one, so it fails with a compilation error asking you to either provide a custom ExecutionContext or to use the global one by adding the following import:

import scala.concurrent.ExecutionContext.Implicits.global

[error] /path/to/src/main/scala/org/example/ping/PingApp.scala:15:6: Cannot find an implicit ExecutionContext. You might pass
[error] an (implicit ec: ExecutionContext) parameter to your method
[error] or import scala.concurrent.ExecutionContext.Implicits.global.
[error]     .serve
[error]      ^
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 3 s, completed 30-May-2018 16:16:30

// Consider the following snippet of code that defines a function
// to list the content in a given directory:

import java.io.File
import scala.concurrent.{ExecutionContext, Future}

def contentInDir(path: String)
                (using ec: ExecutionContext): Future[List[String]] =
  Future {
    val file = new File(path)
    if (file.isDirectory)
    // unfortunately, listFiles returns null
    // if invoked on a file that is not directory
      file.listFiles().toList.map(_.getAbsolutePath)
    else List.empty
  }

// Define a new function that invokes the function contentInDir to count
// the number of items in a directory.


// ANSWER

def countItemsInDir(path: String)
                   (using ec: ExecutionContext): Future[Int] =
  contentInDir(path).map(_.size)

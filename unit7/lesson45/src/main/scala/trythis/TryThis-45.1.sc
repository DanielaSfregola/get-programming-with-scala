// Let’s consider the function contentInDir that you have seen in the Try This section of Lesson 44
// to list the content of a given directory:

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

// Write a function to asynchronously list the content of a directory and all its subdirectories. Visit each subdirectory independently to improve the runtime of your function.


// ANSWER

def allContentInDir(path: String)
                   (using ec: ExecutionContext): Future[List[String]] = {
  for {
    content <- contentInDir(path)
    contentInSubDirs <- Future.sequence(content.map(allContentInDir))
  } yield content ++ contentInSubDirs.flatten
}

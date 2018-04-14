// file Snippet.java
//String dateAsString = "22.11.2017";
//SimpleDateFormat format = new SimpleDateFormat( "dd.MM.yyyy" );
//Date date = format.parse(dateAsString);


// file Snippet.scala
import java.text.SimpleDateFormat
import java.util.Date

val dateAsString = "22.11.2017"
val format = new SimpleDateFormat("dd.MM.yyyy")
val date: Date = format.parse(dateAsString)

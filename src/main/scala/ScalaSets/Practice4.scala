package ScalaSets

/**
 * Managing Book Genres in Scala...
 * Let's explore Scala's mutable.Set to manage our library’s 
 * book genres. Can you update the Scala code by 
 * completing the TODOs to manage genres efficiently?
 */

@main def practice4: Unit =
  // Creating a mutable set of book genres
  val bookGenres = scala.collection.mutable.Set("Fantasy", "Science Fiction", "Mystery")

  // TODO: Add a new genre to the set
  bookGenres += "Romance"
  // TODO: Check if the genre 'Mystery' is in the set and print a message accordingly
  println(s"Is 'Mystery' genre available in the library? Answer: ${bookGenres.contains("Mystery")}")

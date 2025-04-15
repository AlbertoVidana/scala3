package ScalaSets

/**
 * Practice 2: Adding a New Genre to a Mutable Set in Scala
 * In this practice exercise, your goal is to convert 
 * the immutable bookGenres set into a mutable one. 
 * Then, add a new genre, "Romance", to this mutable set. 
 * Finally, print the updated collection to confirm 
 * that "Romance" has been successfully added. 
 * Follow the TODO instructions provided in the starter code.
 */

import scala.collection.mutable.Set

@main def practice2: Unit = 
  // TODO: Convert the immutable set into a mutable set
  val bookGenres = Set("Fantasy", "Science Fiction", "Mystery")

  // Check if 'Mystery' is a genre in the library.
  val isMysteryAvailable = bookGenres.contains("Mystery")

  println(s"Is 'Mystery' genre available in the library? Answer: $isMysteryAvailable")

  // TODO: Add "Romance" to the mutable set
  bookGenres += "Romance"
  // TODO: Print the updated set to confirm "Romance" has been added
  println(s"Update set of books: $bookGenres")
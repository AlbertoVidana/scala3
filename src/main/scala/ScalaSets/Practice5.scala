package ScalaSets

/**
 * Managing Book Genres in Scala...
 * Enhance your collection by managing a set of book genres in Scala. 
 * Add some genres, and remove any that do not fit. s
 * Then, display the unique set of book genres.
 */

import scala.collection.mutable.Set

@main def practice5: Unit =
  // TODO: Initialize a set with some book genres
  val bookGenres = Set("Classic", "Commedy", "Technical")  
  // TODO: Add a new book genre to the set
  bookGenres += "Computer Sience"
  // TODO: Remove a book genre that you think does not fit into the library collection
  bookGenres -= "Commedy"
  // TODO: Print out the unique book genres in the library
  println(s"Available books in the library: $bookGenres")

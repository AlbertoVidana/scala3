package Multidimensional_Arrays

/**
 * Explore a bookshelf in Scala! We have a 
 * multidimensional array representing a bookshelf 
 * with different genres. You're tasked with finding a 
 * mystery book located on the first shelf. Run the 
 * provided Scala program to find out the title of the mystery book!
 */

@main def practice1: Unit =
  val bookshelf = Array(
    Array("Adventure", "Mystery", "Fantasy"),
    Array("Science", "History", "Biography"),
    Array("Poetry", "Drama", "Romance")
  )

  // Find a book in the Mystery section, the second book on the first shelf
  val mysteryBook = bookshelf(0)(1)
  println(s"The book you picked is: $mysteryBook")
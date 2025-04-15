package ScalaSets

/**
 * Practice 1: Exploring Library Genres in Scala
 * Welcome to your library adventure in Scala! 🚀📚 
 * In this task, we'll explore a library's collection to 
 * see how many unique book genres it has. Plus, 
 * we'll uncover if our beloved Mystery books are on 
 * the list. No need to write any code this time—just 
 * cozy up, get familiar with the provided code, and 
 * click Run to reveal the magical results! 🌟
 */

 @main def practice1: Unit = 
  // Define a set of book genres in a library
  val bookGenres = Set("Fantasy", "Science Fiction", "Mystery", "Thriller")

  // Display the number of unique genres in the library
  println(s"The library has ${bookGenres.size} unique genres.")

  // Check if 'Mystery' genre is available in the library
  if bookGenres.contains("Mystery") then
    println("Mystery books are available in the library.")
package ScalaSets

/**
 * Practice 3: Fixing the Library Genre Collection in Scala
 * There seems to be a bug in the code meant to update 
 * the library's genre collection in Scala. The genre is not 
 * being added properly to the set. Can you identify 
 * the mistake and correct it so that the 
 * set reflects the new genre accurately?
 */

 import scala.collection.mutable.Set

@main def practice3: Unit = 
    val libraryGenres = Set("Mystery", "Fantasy", "Science Fiction")
    val newGenre = "Romance"
    
    if !libraryGenres.contains(newGenre) then
        libraryGenres += newGenre
    
    println(s"Updated genres in the library: $libraryGenres")

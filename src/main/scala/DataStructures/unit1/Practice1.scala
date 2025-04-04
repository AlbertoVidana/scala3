package DataStructures.unit1

/**
 * Exploring Scala Arrays with Subway Lines
 * Welcome to the Scala subway system! In this exercise, we'll explore 
 * how Scala arrays can help us manage our subway lines. 
 * Imagine you're managing a vibrant city with multiple subway lines. 
 * We'll show you how to define an array of these subway 
 * lines and how to access this array to find out the first and last 
 * line, as well as count the total number of lines. 
 * Simply hit Run to see the magic unfold in Scala!
 */

 // Define an array of subway lines and access various properties

@main def practice1: Unit =
  // Creating an array of subway lines
  val subwayLines: Array[String] = Array("Red", "Green", "Blue", "Yellow")

  // Accessing the first subway line
  println(s"The first line is: ${subwayLines(0)}")
  
  // Printing the number of subway lines
  println(s"Number of lines: ${subwayLines.length}")
  
  // Accessing the last subway line
  println(s"The last line is: ${subwayLines.last}")
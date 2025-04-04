package DataStructures.unit1

/**
 * Subway Line Selector Debug
 * 
 * Oh no, it looks like there's a hiccup in our subway line selector! 
 * The code is supposed to display the name of the selected 
 * subway line and the total number of lines, but something's gone wrong. 
 * Can you figure out what needs fixing? 
 * Let's get this train back on track!
 */

 @main def practice3: Unit =
  val subwayLines = Array("Red Line", "Green Line", "Blue Line")
  val selectedLineIndex = 3
  val lineName = subwayLines(selectedLineIndex)
  
  println(s"Selected subway line: $lineName")
  println(s"Total subway lines: ${subwayLines.length}")
package NestedLooops

/**
 * An astronaut, it appears that our stellar game 
 * board isn't displaying correctly. The board 
 * should present a tidy grid with distinct 
 * rows and columns, but currently it's a bit 
 * of a mess. Can you identify the problem and 
 * correct it so that the board shows properly? 
 * Ensure each row is distinct and separated onto its own line.
 */

 object Main extends App {
  // Generates a 3x3 grid to represent a simple board game layout
  for (row <- 1 to 3) {
    for (col <- 1 to 3) {
      print(s"[$row,$col] ") // Prints grid coordinates
    }
    // Something's not quite right here. Why aren't the rows separated?
    println()
  }
}
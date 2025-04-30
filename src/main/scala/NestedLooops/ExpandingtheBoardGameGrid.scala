package NestedLooops

/**
 * Adjust the nested loops in your starter code 
 * to expand your grid from 3x3 to 4x4. 
 * Setting up your board game with a 
 * larger grid will enhance the gaming experience!
 */

 object Main2 extends App {
  // Nested loop to simulate a simple board game grid of 3x3
  var row = 1
  // TODO: Modify this loop to produce a 4x4 grid
  while (row <= 3) {
    var col = 1
    // TODO: Modify this loop to produce a 4x4 grid
    while (col <= 3) {
      print(s"[$row,$col] ") // Prints grid coordinates
      col += 1
    }
    println() // Moves to the next line for the next row
    row += 1
  }
}
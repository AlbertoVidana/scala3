package NestedLooops

/**
 * In this task, we're going to create a pattern 
 * using a nested loop that alternates between 
 * '-' and '+' characters to form a 3x3 matrix. 
 * Execute the code to see how nested loops are 
 * utilized in Scala to generate patterns.
 */

 object Main1 extends App {
  val matrixSize = 3
  for (row <- 1 to matrixSize) {
    for (col <- 1 to matrixSize) {
      if ((row + col) % 2 == 0) print("-") else print("+")
    }
    println()
  }
}
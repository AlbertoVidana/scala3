package Multidimensional_Arrays

/**
 * Now, let's make some moves on our Tic Tac Toe board in Scala. 
 * Position an 'X' in the top-left corner and an 'O' in the 
 * center-right square. Your task is to figure out the correct indices.
 */

@main def practice4: Unit = 
  // Imagine a 3x3 Tic Tac Toe board
  var ticTacToe = Array(
    Array("", "", ""),  // First row
    Array("", "O", ""), // Second row with 'O' in the center
    Array("", "", "")   // Third row
  )

  // TODO: Assign 'X' to the top-left square of the board.
  ticTacToe(0)(0) = "X"
  println(s"Updated row 1: ${ticTacToe(0).mkString(", ")}") // Expected output "Updated row 1: X, , "

  // TODO: Assign 'O' to the center-right square of the board.
  ticTacToe(1)(2) = "O"
  println(s"Updated row 2: ${ticTacToe(1).mkString(", ")}") // Expected output "Updated row 2: , O, O"

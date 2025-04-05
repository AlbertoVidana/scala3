package Multidimensional_Arrays

/**
 * Show off your skills in Scala by creating a simple 
 * 2x2 tic-tac-toe board and printing the content of 
 * a specific cell. No moves to be made—just set up 
 * the board and select any cell to display its content.
 
    (-_-) BAD ANSWER
    Good try, but there are a couple of things to adjust:

    The board should be 2x2, not 3x3.
    You need to print the content of a specific cell, not all rows.

    Would you like some help with these adjustments? 🤔
 */

@main def practice5: Unit =
  // TODO: Create a 2x2 tic-tac-toe game board with some moves already made
  val ticTacToe = Array(
    Array("X", ""),
    Array("", "O")
  )
  // TODO: Access and print the content of a cell on the game board
  println(s"Row 1: ${ticTacToe(0)(0)}")

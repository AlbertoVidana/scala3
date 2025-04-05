package Multidimensional_Arrays

/**
 * Hey there, fellow chess enthusiast! We've got a fun little 
 * challenge for you. It looks like there's a tiny hiccup 
 * in our miniature chessboard logic. Our dear Rook is 
 * trying to move from one position to another, but something 
 * went wrong in the process. Run the code below, put on your 
 * detective hat, and fix the movement of the Rook so it 
 * follows our chess rules. Happy debugging!
 */

@main def practice3: Unit =
  val miniChessboard = Array(
    Array("R", "K", ""),
    Array("", "", ""),
    Array("", "P", "")
  )

  miniChessboard(1)(0) = miniChessboard(0)(0)
  miniChessboard(0)(0) = ""

  println(s"Row 1: ${miniChessboard(0).mkString(", ")}")  // Expected output: "Row 1: , K, "
  println(s"Row 2: ${miniChessboard(1).mkString(", ")}")  // Expected output: "Row 2: R, , "

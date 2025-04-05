package Multidimensional_Arrays

/**
 * In this task, you will program in Scala to simulate a 
 * move in a game of tic-tac-toe. Specifically, your 
 * job is to update the code so that the 'O' player 
 * makes a move by occupying the top right square of 
 * the tic-tac-toe board. Modify the value of the top 
 * right square from empty to 'O' and print its value. 
 * Let's see how you do!
 */

@main def practice2: Unit =
    // Creating a 2D array representing a tic-tac-toe board
    val ticTacToeBoard = Array(
        Array("X", "", ""),   // Row 0
        Array("O", "X", ""),   // Row 1
        Array("", "", "X")     // Row 2
    )

    // TODO: Change the top right corner from empty to 'O' and print its value
    ticTacToeBoard(0)(2) = "O"
    println(s"Top right corner contains: ${ticTacToeBoard(0)(2)} ")
    // Accessing the center square of the board
    val centerSquare = ticTacToeBoard(1)(1)
    println(s"Center square contains: $centerSquare")  // Expected output: "Center square contains: X"
    
    // Modifying a square and updating the board
    ticTacToeBoard(2)(0) = "O"
    println(s"Bottom left square after update: ${ticTacToeBoard(2)(0)}")  // Expected output: "Bottom left square after update: O"

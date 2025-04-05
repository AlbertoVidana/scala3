package Multidimensional_Arrays
/**
Overview and Goal

Hello and welcome! In our journey today, we'll delve into multidimensional arrays in Scala, a powerful metaphor for a chessboard in programming. Our objective is to enable you to create, access, and modify these diverse arrays. Get ready and let's dive in!
Visualizing a Multidimensional Array

Think of a multidimensional array as an array of arrays. Similar to a chessboard, each square, identifiable via its row and column coordinates, stands for a specific value or chess piece. Let's not forget, this 2D visualization is not limiting us. Scala allows creating arrays with 3, 4, or even more dimensions, smoothly extending this concept.
Creating a Multidimensional Array

In Scala, you can declare multidimensional arrays using the Array keyword along with parentheses to group arrays. Take a look:

Scala

@main def run: Unit = 

  val chessboard = Array( 

    Array("R", "N", "B", "Q", "K", "B", "N", "R"), // Each inner array represents a row on the chessboard

    Array("P", "P", "P", "P", "P", "P", "P", "P"),

    Array("", "", "", "", "", "", "", ""),

    // ...

  ) // End of the outer array


  // Access and print first two rows of the chessboard

  println("Row 1: " + chessboard(0).mkString(", ")) // Outputs: Row 1: R, N, B, Q, K, B, N, R

  println("Row 2: " + chessboard(1).mkString(", ")) // Outputs: Row 2: P, P, P, P, P, P, P, P

In our chessboard array abstraction, each row represents an inner array, whose elements we can access using two indices.
Accessing Elements in a Multidimensional Array

Let's use our chessboard analogy to fetch a piece from a specific spot:

Scala

@main def run: Unit = 

  val chessboard = Array(

    Array("R", "N", "B", "Q", "K", "B", "N", "R"),

    Array("P", "P", "P", "P", "P", "P", "P", "P"),

    Array("", "", "", "", "", "", "", ""),

    // ...

  )


  val piece = chessboard(0)(2) // Access 3rd piece at the first row

  println(piece) // Outputs: B

In the above example, piece holds "B" (representing a bishop in chess) positioned at the location (0, 2).
Modifying Elements in a Multidimensional Array

As mentioned in the previous lesson, the Array type in Scala is mutable, allowing for the modification of elements. Here's how to do this:

It's worth noting in Scala, if you need to modify the size, you can use the List type, which provides more flexibility.
Summary

Well done on your first exploration with multidimensional arrays in Scala! We've grasped their structure, created a chessboard paradigm for the arrays, accessed a chess piece, and made a chess move. Essentially, we've learned to create, access, and modify multidimensional arrays. Are you ready for practice exercises to reinforce these newfound skills? Let's jump in! Happy coding!

Scala
*/
@main def run: Unit = 

  val chessboard = Array(

    Array("R", "N", "B", "Q", "K", "B", "N", "R"),

    Array("P", "P", "P", "P", "P", "P", "P", "P"),

    Array("", "", "", "", "", "", "", ""),

    // ...

  )


  chessboard(1)(4) = "" // Make the initial spot of a pawn empty

  chessboard(0)(4) = "P" // Move pawn one square backwards


  println("Row 1: " + chessboard(0).mkString(", ")) // Outputs: Row 1: R, N, B, Q, P, B, N, R

  println("Row 2: " + chessboard(1).mkString(", ")) // Outputs: Row 2: P, P, P, P, , P, P, P

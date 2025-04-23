package For

import java.util.Formatter

/**
 * Exploring List Iteration in Scala
 * 
 * In the provided code, you will explore iterating over a 
 * list with three for loop techniques: a basic loop, using 
 * indices for ordinal numbers, and the Scala-idiomatic .zipWithIndex 
 * method. Click Run to see how each method displays school activities.
 */

 object Main extends App {
    // Define a list of school activities
    val activities = List("Sports", "Arts", "Science", "Music")
    
    // Simple for-loop to print each activity in the list
    for (activity <- activities) {
        println(activity)
    }
    
    // Separate different methods output
    println("\n--- Using Indices ---")

    /* 
     * Classical for-loop using indices 
     * to print activities with ordinal numbers.
     * This loop iterates through the list indices,
     * allowing us to access each element by its index
     */
    for (i <- activities.indices) {
        println(s"${i + 1}. ${activities(i)}") // i + 1 to make the ordinal number start from 1 instead of 0
    }

    // Separate different methods output
    println("\n--- Using zipWithIndex ---")

    /* 
     * Enhanced for-loop using .zipWithIndex
     * to iterate over the list.
     * .zipWithIndex provides both the index
     * and the value of each element in the list
     */
    for ((activity, index) <- activities.zipWithIndex) {
        println(s"${index + 1}. $activity") // index + 1 to adjust the ordinal number to start from 1
    }
}
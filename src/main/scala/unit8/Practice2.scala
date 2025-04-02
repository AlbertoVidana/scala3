package unit8

/**
 * Explore a different method of creating a message in Scala. 
 * Change the starter code to use concatenation with 
 * the + operator to create the message string, instead of using 
 * string interpolation with the s prefix and $. Aim to make as 
 * few changes as possible to achieve this.
 */

 @main def run2: Unit =
    val userName = "Alice"
    val friendName = "Bob"
    // Change the string interpolation to concatenation in the line below
    val message = "Hi " + friendName + ", " + userName + " wants to chat with you!"
    println(message)

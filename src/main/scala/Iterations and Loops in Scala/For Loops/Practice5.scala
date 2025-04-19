package `Iterations and Loops in Scala`.`For Loops`

/**
 * Scala Classroom Inventory: Iterating with Style
 * 
 * Greetings! Imagine that you're inside a classroom. 
 * Let's create a list of items you might find in a 
 * classroom and print a custom message for each, using the 
 * Scala for loop syntax without braces {} and with a single statement. 
 * Your objective is to print each item with the format We have a [item] 
 * in the classroom, and make sure to do this without using 
 * curly braces {} in your loop.
 */

object ClassroomItemsPrinter extends App {
  // TODO: Create a list of classroom items
  val items = List("Pen", "Pencil", "Scissors", "Gluee")
  // TODO: Use the for-loop without braces and a single statement to print each classroom item with the message "We have a [item] in the classroom."
  for (item <- items) println(s"We have a $item in the classroom")
}
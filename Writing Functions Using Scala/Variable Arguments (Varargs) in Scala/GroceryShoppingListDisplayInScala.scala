/**
 * Welcome to the Scala grocery shopping list task! 
 * Your objective is to complete a Scala program that 
 * displays the contents of a grocery shopping list. 
 * Follow the TODO instructions in the starter 
 * code to complete the exercise.
 */

 def listGroceries(items: String*) =
  // TODO: Write a loop that iterates through each item and prints it out prefixed with a dash.
  for (item <- items) println(s"- $item")

@main def run: Unit =
  listGroceries("Apples", "Bread", "Milk")
/**
 * Picture yourself as an apprentice chef who 
 * needs to blend ingredients for various dishes. 
 * Your goal is to learn how to blend these 
 * ingredients using method overloading in Scala. 
 * Think of it as crafting a salad with different 
 * vegetables or preparing a soup with varying 
 * quantities of spices.
 * For this task, you do not need to write any code. 
 * Simply review the provided code, execute it by 
 * clicking the "Run" button, and observe the outputs.
 */

 def mix(ingredient1: String, ingredient2: String): Unit = 
  println(s"Mixing $ingredient1 and $ingredient2 for a salad!")

def mix(ingredient: String, quantity: Int): Unit = 
  println(s"Mixing $quantity tablespoons of $ingredient for soup!")

@main def run: Unit =
  mix("Tomato", "Cucumber") // This invokes mix(ingredient1: String, ingredient2: String)
  mix("Lentils", 3)         // This invokes mix(ingredient: String, quantity: Int)
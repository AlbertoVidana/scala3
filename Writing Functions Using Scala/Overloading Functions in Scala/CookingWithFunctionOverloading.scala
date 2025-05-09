/**
 * Great job on covering function overloading! Now, can you define a new overloaded function that lets us cook a dish with a spice level? The spice level should be a string, for example, "Mild", "Medium", or "Hot". Remember, the function name should remain the same.
 */

 def cook(recipe: String): Unit = 
  println(s"Cooking $recipe...")

def cook(recipe: String, minutes: Int): Unit = 
  println(s"Cooking $recipe for $minutes minutes.")

// TODO: Define an overloaded function that accepts a recipe and its spice level
def cook(recipe: String, spice: String): Unit =
  println(s"Cooking $recipe and $spice spice level")
  
@main def run: Unit =
  cook("Pizza")                             // Output: Cooking Pizza...
  cook("Spaghetti", 10)                     // Output: Cooking Spaghetti for 10 minutes.
  // TODO: Call your new overloaded function with a dish and its spice level
  cook("Tacos", "Midium")
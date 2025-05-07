/**
 * In this task, we will add another overloaded 
 * version of the serveDish function to handle 
 * dietary preferences. Your goal is to add a 
 * new version of the serveDish function that 
 * takes three parameters: dishName, 
 * spiceLevel, and dietaryPreference. 
 * After implementing the new function, 
 * update the main method to test it. Let's get started!
 */

 def serveDish(dishName: String): Unit =
  println(s"Here's your tasty $dishName.")

def serveDish(dishName: String, spiceLevel: String): Unit =
  println(s"Here's your tasty $dishName with $spiceLevel spice.")

// TODO: Add another overloaded version of serveDish function with three parameters: dishName, spiceLevel, and dietaryPreference
// TODO: The message should follow this format: "Here's your tasty <dish name> with <spice level> spice, preferred <dietary preference>."
def serveDish(dishName: String, spiceLevel: String, dietaryPreference: String): Unit = 
  println(s"Here's your tasty $dishName with $spiceLevel spice, preferred $dietaryPreference")

@main def run: Unit =
  serveDish("Pasta")                  // Serves Pasta without specifying spice level or dietary preference.
  serveDish("Tacos", "medium")        // Serves Tacos with medium spice level.
  // TODO: Call the overloaded function you created with "Tacos", "medium", and "vegetarian" parameters
  serveDish("Tacos", "medium", "vegetarian")

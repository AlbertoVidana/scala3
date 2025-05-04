/**
 * Unlock the secret to a perfect pancake batter using Scala functions!
 * In the provided code, we're combining flour, eggs, and milk to 
 * demonstrate the description of the pancake batter mix. 
 * Hit Run to discover how the output looks!
 */

 // Function to mix ingredients for a pancake batter and print the mix description
def mixBatter(flourGrams: Int, eggsCount: Int, milkMilliliters: Int): Unit =
  println(s"Mixing $flourGrams grams of flour, $eggsCount eggs, and $milkMilliliters milliliters of milk to make a pancake batter.")

@main def run: Unit =
  // Mix the ingredients by calling the function
  mixBatter(250, 2, 300)
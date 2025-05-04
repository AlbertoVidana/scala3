/**
 * Welcome to your next challenge! Let's 
 * enhance our pancake ingredient calculator. 
 * You'll modify the calculateIngredients 
 * method to include an extra parameter 
 * eggsPerPancake which specifies the number 
 * of eggs needed per pancake. This will help us 
 * calculate the total number of eggs required 
 * for your pancake feast. Don't forget to adjust 
 * the message to include the number of eggs required. 
 * Let's get cooking!
 */

 // Method to calculate the ingredients needed for a given number of pancakes
// TODO: Modify this method to include an extra parameter `eggsPerPancake` for the number of eggs needed per pancake
def calculateIngredients(pancakes: Int): Unit =
  val flourGrams = pancakes * 50 // Each pancake needs 50 grams of flour
  val milkMl = pancakes * 30 // Each pancake needs 30ml of milk

  // TODO: Modify the message to include the number of eggs needed
  println(s"For $pancakes pancakes, you need $flourGrams grams of flour and $milkMl ml of milk.")

@main def run: Unit =
  calculateIngredients(3) // Change the number to calculate ingredients for a different number of pancakes
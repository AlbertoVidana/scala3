/**
 * Let's make sure we have a perfect pancake 
 * by checking our ingredients first! 
 * Complete the cookPancake function to 
 * ensure that all ingredient amounts are 
 * positive before making a pancake. If any 
 * ingredient is not positive, print an error 
 * message; otherwise, proceed with making the pancake.
 */

 def cookPancake(flourGrams: Int, eggsCount: Int, milkMl: Int): Unit = 
    // TODO: Check if all ingredients amounts are positive; 
    // If so, print: "Cooking pancake with X grams of flour, Y eggs, and Z ml of milk."
    // Otherwise, print: "Error: All ingredients must have positive amounts."
    print("TODO")

@main def run: Unit = 
    cookPancake(150, 2, 250) // This should print the pancake cooking message
    cookPancake(-50, 2, 250) // This should print an error message
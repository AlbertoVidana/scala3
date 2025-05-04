/**
  * Welcome to the Scala Pancake Cooking Task! 🍽️ In this task, you'll create a simple and fun function in Scala called cookPancake.

Your function will accept three parameters:

    The amount of flour in grams
    The number of eggs
    The amount of milk in milliliters

Once you have your function defined, you'll call it to simulate preparing a pancake with the specified amounts of ingredients.

Expected message: "Cooking pancake with X grams of flour, Y eggs, and Z ml of milk."

Ready? Let's get cooking!
  */

// TODO: Define a function 'cookPancake' with parameters for flour (in grams), eggs, and milk (in milliliters)
//       The function should output: "Cooking pancake with X grams of flour, Y eggs, and Z ml of milk."
def cookPancake(flourGrams: Int, eggsCount: Int, milkMl: Int): Unit = 
    print(s"Cooking pancake with $flourGrams grams of flour, $eggsCount eggs, and $milkMl ml of milk.")
// TODO: Inside the main method, invoke 'cookPancake' with appropriate values for a pancake

@main def run: Unit = 
    cookPancake(150, 2, 250)
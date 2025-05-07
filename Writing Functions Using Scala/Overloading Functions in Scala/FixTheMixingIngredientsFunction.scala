/**
 * Welcome to the kitchen recipe application! 
 * Your task is to ensure that the mixing 
 * ingredients function produces the correct output. 
 * Currently, the code produces unexpected 
 * results when mixing ingredients with their 
 * respective quantities. Run the provided 
 * code and observe the outputs. Can you 
 * identify the mistake? Fix the function 
 * signatures so that the code produces 
 * the expected results.
 */

 def mixIngredients(ingredient: String, grams: Int): Unit = 
  println(s"Mix $grams grams of $ingredient")

def mixIngredients(count: Int, ingredient: String): Unit = 
  println(s"Mix $count $ingredient")

@main def run: Unit = 
  mixIngredients("flour", 500) // Expected output: Mix 500 grams of flour
  mixIngredients(3, "egg") // Expected output: Mix 3 egg
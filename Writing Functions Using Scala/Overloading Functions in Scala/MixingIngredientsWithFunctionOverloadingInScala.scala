/**
 * Hey there! In this exercise, we'll 
 * continue exploring function overloading 
 * within Scala, which allows us to have 
 * multiple methods with the same name but 
 * different parameter lists. Your task is 
 * to implement a versatile mix method for 
    a kitchen application that can combine 
    either a pair of ingredients or a trio. 
    You'll get to overload the mix method to 
    accommodate these different scenarios. 
    Let's get mixing!
 */

 // TODO: Define a method to mix two ingredients and print out the result
// Expected message: Mixing <ingredient1> and <ingredient2> for a tasty treat!
def mixIngredient(ingredient1: String, ingredient2: String): Unit =
  println(s"Mixing $ingredient1 and $ingredient2 for a tasty treat!")
// TODO: Define a method to mix three ingredients and print out the result
// Expected message: Mixing <ingredient1>, <ingredient2>, and <ingredient3> for a delicious dish!
def mixIngredient(ingredient1: String, ingredient2: String, ingredient3: String):Unit =
  println(s"Mixing $ingredient1, $ingredient2, and $ingredient3 for a delicious dish!")
@main def run: Unit = 
  // TODO: Call the method to mix two ingredients, e.g. "Eggs" and "Flour"
  mixIngredient("Eggs", "Bacon")
  // TODO: Call the method to mix three ingredients, e.g. "Sugar", "Butter", and "Chocolate"
  mixIngredient("Pasta", "Rague Sause", "Chees")
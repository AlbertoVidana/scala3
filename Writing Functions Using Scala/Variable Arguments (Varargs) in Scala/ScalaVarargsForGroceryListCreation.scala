/**
 * Welcome! In this task, you'll leverage your Scala 
 * skills to define and invoke a function that 
 * accepts a title for your shopping 
 * list and a variable number of grocery items as arguments. 
 * The function should print out the title followed by 
 * each item on a new line with a bullet point. 
 * Utilize Scala's varargs feature to achieve this. 
 * Let's get started!
 */

// TODO: Define a `listGroceries` function that accepts a title for the list and a variable number of strings as groceries (using varargs feature in Scala), then prints the title and each item with a bullet point.
def listGroceries(title: String, items: String*) =
  println(s"$title")
  for (item <- items) println(s"- $item")

@main def run: Unit = 
  // TODO: Call the function you defined above with a title "My Grocery Shopping List" and a list of groceries: "Apples", "Bread", "Milk".
  listGroceries("My Grocery Shopping List", "Apples", "Bread", "Milk")
  
/*
 Expected Output:
 My Grocery Shopping List
 - Apples
 - Bread
 - Milk
*/
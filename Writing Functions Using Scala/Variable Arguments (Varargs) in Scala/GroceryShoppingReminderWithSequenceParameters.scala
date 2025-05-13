/**
 * Welcome! In this task, you will utilize the power 
 * of Varargs in Scala to create a shopping list 
 * reminder. In the IDE you can see a function 
 * that accepts a sequence of grocery items and 
 * prints out a reminder for each. Simply execute 
 * the code to see your shopping reminder in action,
 * no coding required.
 */

 def listGroceries(items: String*): Unit = 
  for (item <- items) println(s"Don't forget to buy $item")

@main def run: Unit = 
  listGroceries("Milk", "Eggs", "Bread")
/**
 * Hey there! Ready to dive into some Scala fun?
 * Your task is to adapt the listGroceries 
 * function to accept a variable number of 
 * string arguments (vararg) instead of an array. 
 * Also, don't forget to modify the function call 
 * in the main method to match this change.
 * 
 * You've got this!
 */

 // TODO: Modify the listGroceries function to accept a variable number of string arguments (vararg) instead of an array.
def listGroceries(items: Array[String]): Unit = 
  for item <- items do
    println(s"Don't forget to buy $item!")

@main def run: Unit = 
  // TODO: Modify the function call to match the new definition of listGroceries.
  listGroceries(Array("Apples", "Bananas", "Carrots"))
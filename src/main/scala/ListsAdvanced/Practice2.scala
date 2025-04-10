package ListsAdvanced

import scala.collection.mutable.ListBuffer

/**
 * To-Do List Debugging in Scala
 * 
 * Your mission, should you choose to accept it, entails 
 * squashing a few bugs in the given Scala code. The intention 
 * behind the program is simple - it's a small to-do list manager. 
 * However, it seems something has gone awry. Your job is to 
 * pinpoint the mistakes and correct the code, ensuring that 
 * it functions as it's supposed to. No new features 
 * should be added - just fix what's there. Happy debugging!
 */

 @main def practice2: Unit = 
  var toDoList = List("buy milk", "study", "walk the dog")
  println(toDoList.last)  // Prints the last task in the list
  
  toDoList = toDoList :+ "call a friend"  // Adds another task to the list
  println(toDoList.size)  // Prints the new size of the list
  println(toDoList(3))    // Accesses the fourth task in the list

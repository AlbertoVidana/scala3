package ListsAdvanced

/**
 * Appending a Task to the To-Do List in Scala
 * 
 * Imagine you have a to-do list for the day. 
 * You've already written down some tasks, and you 
 * want to include another vital task: "Take a walk." 
 * The given code manages this list and shows how to 
 * append a new task. Let’s run the code to see 
 * the to-do list after adding the new task.
 */

 import scala.collection.mutable.ListBuffer

@main def practice1: Unit =
    val toDoList = ListBuffer("Read Scala basics", "Practice coding", "Have a healthy meal")

    // Print the first task
    println(toDoList(0))

    // Appending a new task to the to-do list
    toDoList += "Take a walk"
    println(toDoList)  // Print the updated list

package ListsAdvanced

/**
 * Daily Task List in Scala
 * 
 * Your final mission for this lesson is to write a Scala program. 
 * This program should keep track of daily tasks and display 
 * the first and last items in a list. Remember to use zero-based 
 * indexing, and be careful with list boundaries!
 */

@main def practice4: Unit = 
  // TODO: Define an immutable list of your daily tasks
  val tasksList = List("Study", "Dring Coffee", "Have brakfast", "Sleep")
  // TODO: Print the first task from your list using the appropriate method
  println(s"The fist task on my list: ${tasksList(0)}")
  // TODO: Print the last task from your list using the appropriate method
  val listLength:Int = tasksList.length - 1
  println(s"Last task on my list: ${tasksList(listLength)}")
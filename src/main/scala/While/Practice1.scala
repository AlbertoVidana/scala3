package While

/**
 * Boiling Eggs Simulation in Scala
 * 
 * Imagine you're preparing breakfast and 
 * need to boil five eggs. The given code 
 * simulates the process of boiling each 
 * egg one by one until all are done. 
 * Execute the code to see the simulation 
 * of this kitchen task using a While Loop in Scala.
 */

 object Main1 extends App {
  var eggsToBoil = 5 // We have 5 eggs to boil for breakfast
  while (eggsToBoil > 0) { // As long as there are eggs left to boil
    println(s"Boiling egg number: ${6 - eggsToBoil}") // Print the egg we are boiling
    eggsToBoil -= 1 // Decrease the number of eggs left to boil
  }
  println("All eggs are boiled!") // When done, print all eggs are boiled
}
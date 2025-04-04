package DataStructures.unit1

/**
 * Scala Subway Switcheroo
 * All aboard the Scala express! 🚂 Your mission, 
 * should you choose to accept it, is to modify the starter 
 * code to print out the last car of the subway train 
 * instead of the first one. Remember how arrays work 
 * in Scala, and tap into that knowledge here. 
 * One tiny rule: no hardcoding the index! Ready? 
 * Let's get those wheels rolling and go coding!
 */

 @main def practice2: Unit = 
  val subwayCars = Array("Car 1", "Car 2", "Car 3", "Car 4") // This array represents the cars of a subway train.
  println(s"The train has ${subwayCars.length} cars.") // It tells us how many cars the train has.
  println(s"The leading car is ${subwayCars(0)}.") // CHANGE THIS LINE to show the last car of the train instead.
  println(s"Valid car positions range from ${subwayCars.indices}.") // It gives us the valid range for car positions.
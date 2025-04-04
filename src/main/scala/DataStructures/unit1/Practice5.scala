package DataStructures.unit1

/**
 * Space Fleet Array Challenge
 * 
 * Delve into the world of arrays, Navigator of Codes! 
 * Your quest is to craft a Scala application from the ground up. 
 * Think of arrays as a compilation of starships in a fleet. 
 * You are to create an array that represents different 
 * spaceships and display the total count alongside 
 * the names of the first and final spaceship.
 */

 @main def practice5: Unit =
  // TODO: Define an array named 'spaceFleet' with the names of three spaceships
  val spaceFleet = Array("ShipA", "ShipB", "ShipC")
  // TODO: Print the number of starships in the space fleet
  println(s"The fleet length is ${spaceFleet.length}")
  // TODO: Print the name of the first spaceship
  println(s"The fist ship is ${spaceFleet.head}")
  // TODO: Print the name of the last spaceship using the array's length property
  println(s"The last ship is ${spaceFleet.last}")
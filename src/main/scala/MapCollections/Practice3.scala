package MapCollections

/**
 * In this task, you are responsible for 
 *  maintaining a record of animal habitats in a zoo. 
 *  You are required to add a new animal to the registry 
 *  and remove another one. There is a complication in 
 *  the code that needs to be addressed for it to 
 *  work correctly. Let's dive in and correct the code!
 */

 import scala.collection.mutable

@main def practice3: Unit =
  var zooAnimalHabitats = Map("Lion" -> "Savannah", "Penguin" -> "Aquarium")
  zooAnimalHabitats += ("Bear" -> "Forest") // Add a new animal habitat to the map
  println(zooAnimalHabitats) // Print the updated map including the new animal habitat
  zooAnimalHabitats -= "Penguin" // Removing the penguin habitat for renovation
  println(zooAnimalHabitats.keySet) // Print the remaining keys in the map

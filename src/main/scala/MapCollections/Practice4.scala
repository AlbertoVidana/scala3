package MapCollections

/**
 * Let's check your understanding of Scala's Map collections. 
 * Create a small program that maps zoo animals to their 
 * habitats and then retrieve and print the habitat of a 
 * specific animal. Ensure your map contains the following 
 * animals: "Elephant", "Polar Bear", and "Flamingo".
 */

 @main def practice4: Unit = 
  // TODO: Define a map named 'zooAnimals' mapping animal names to their habitats
  val map = Map("Elephant" -> "Sabana", "Polar Bear" -> "Antartida", "Flamingo" -> "Tropical Lake")
  // TODO: Print the habitat of the "Flamingo"
  println("The habitat of Flamingo is: " + map.get("Flamingo"))
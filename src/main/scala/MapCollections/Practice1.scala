package MapCollections

/**
 * Create a map of animals and their habitats, then print the 
 * habitat of a Polar Bear and the total number of animal 
 * species in the zoo. Execute this code to see the 
 * information the zoo brochure would display!
 */

@main def practice1: Unit =
    // Create an immutable map of animals and their habitats
    val zooHabitats = Map("Giraffe" -> "Savannah", "Polar Bear" -> "Arctic", "Orangutan" -> "Rainforest")
    
    // Print out habitat of the Polar Bear
    println("Habitat of Polar Bear: " + zooHabitats("Polar Bear"))  
    
    // Print the size of the map
    println("Number of animals in the zoo: " + zooHabitats.size)

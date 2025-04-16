package MapCollections

/**
 * Extend our zoo map by adding a new animal and its habitat 
 * directly in the map declaration. Remember the map 
 * syntax for Scala and how to pair keys with values.
 */

 @main def practice2: Unit =
    // Define a map with animal names as keys and their habitats as values
    val zooHabitats = Map("Giraffe" -> "Savanna", "Polar Bear" -> "Arctic", "Parrot" -> "Rainforest",
    "Monkey" -> "Jungle")

    // Access and print the habitat of the "Polar Bear"
    println(zooHabitats("Polar Bear"))  // Should print "Arctic"

    // Print the size of the map to know how many animal habitats are listed
    println(zooHabitats.size)  // Should print the number of key-value pairs in the map

package MapCollections

/**
 * Welcome to the Virtual Zoo adventure! Your 
 * mission is to perform operations using map 
 * properties on our virtual zoo. Specifically, add 
 * a new animal to the provided mutable map with 
 * its habitat, then use various map properties to 
 * retrieve and print information such as the size 
 * of the map, all keys, all values, and check if a 
 * specific animal exists in the map. Get ready to 
 * have some fun with map properties!
 */

 @main def run: Unit =
    val zooAnimals = scala.collection.mutable.Map("Elephant" -> "Africa", "Panda" -> "Asia", "Koala" -> "Australia")
    // TODO: Add a new animal to the map with its corresponding habitat
    zooAnimals += "Polar Bear" -> "North Pole"
    // TODO: Print the size of the map
    println(s"The size of the map is: ${zooAnimals.size}")
    // TODO: Print out all keys (animal names)
    println(s"Animals in the map: ${zooAnimals.keys}")
    // TODO: Print out all values (habitats)
    println(s"Habitats of the animals on the map: ${zooAnimals.values}")
    // TODO: Check if the newly added animal exists in the map and print the result
    if (zooAnimals.contains("Polar Bear")) {
        println(s"New animal added to the map: ${zooAnimals.get("Polar Bear")}")
    }
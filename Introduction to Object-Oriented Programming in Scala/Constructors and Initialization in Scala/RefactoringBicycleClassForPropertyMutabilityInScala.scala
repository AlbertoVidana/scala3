/**
 * Immerse yourself in Scala and the intricacies 
 * of property mutability! Your task is to 
 * refactor the Bicycle class to make the color 
 * property mutable, so it can be modified 
 * after instantiation, while ensuring that 
 * the model property remains immutable.
 */

// Regular class definition with immutable properties
class Bicycle(val color: String, val model: String)

@main def run: Unit =
    val myBicycle = new Bicycle("black", "Mountain")
    myBicycle.color = "red" // This line causes an error
    println(s"My bicycle is a ${myBicycle.color} ${myBicycle.model}.")
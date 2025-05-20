/**
 * Welcome to an exciting exercise in Scala! 
 * Your task is to breathe life into the 
 * Vehicle class by creating two instances 
 * in the main function. First, you'll create a 
 * "Bike" with 2 wheels, and then an "Automobile" 
 * with 4 wheels. Let's see these vehicles come to 
 * life in your code!
 */

class Vehicle(val vehicleType: String, val wheels: Int):
  println(s"Vehicle type is $vehicleType with $wheels wheels")

@main def run: Unit =
  // TODO: Create an instance of Vehicle representing a Bike with 2 wheels.
  val bike = new Vehicle("Bike", 2)
  // TODO: Create an instance of Vehicle representing an Automobile with 4 wheels.
  val automobile = new Vehicle("Automobile", 4)
  
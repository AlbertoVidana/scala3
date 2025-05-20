/**
 * Create a class named Vehicle in Scala, which 
 * receives vehicleType and color as parameters 
 * in its primary constructor. Instantiate a 
 * Vehicle object, and then invoke a method to 
 * alter its color. Use this task to demonstrate 
 * your understanding of Scala's class 
 * constructors, instances, and methods.
 */

// TODO: Define a class named Vehicle with a primary constructor that takes 'vehicleType' (immutable) and 'color' (mutable) as parameters.
class Vehicle(val vehicleType: String, var color: String):
  // TODO: Inside the class, include a println statement that outputs "Initializing a new [vehicleType] vehicle."
  println(s"Initializing a new $vehicleType vehicle.")
  // TODO: Define a method inside the Vehicle class named repaint, which takes a newColor parameter and updates the color of the vehicle. Additionally, print the updated color with a descriptive message.
  def repaint(color: String): Unit = 
  this.color = color
  println(s"The color of this vehicle has been repainted to ${this.color}")

@main def run: Unit =
  // TODO: Instantiate a Vehicle and call the repaint method to change its color.
  val car = new Vehicle("SUV", "Red")
  car.repaint("Pink")
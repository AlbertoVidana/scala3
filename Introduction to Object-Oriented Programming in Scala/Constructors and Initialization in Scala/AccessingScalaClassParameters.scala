/**
 * The code below is intended to print out 
 * the type of each vehicle after it's been
 * created, however, there seems to be a problem. 
 * Can you work out what needs to be included to 
 * correctly access the vehicleType attribute of 
 * each Vehicle in the main method? Utilize your 
 * understanding of Scala classes and properties 
 * to solve the issue.
 */

class Vehicle(vehicleType: String, wheels: Int, color: String):
  println(s"Initializing a ${this.color} ${this.vehicleType} with ${this.wheels} wheels.")

@main def run: Unit =
  val car = new Vehicle("Car", 4, "red")
  println(car.vehicleType) // Expected output: "Car"
  println(car.wheels) // Expected output: 4
  println(car.color) // Expected output: "red"
  
  val bike = new Vehicle("Bike", 2, "blue")
  println(bike.vehicleType) // Expected output: "Bike"
  println(bike.wheels) // Expected output: 2
  println(bike.color) // Expected output: "blue"
/**
 * The vehicle count is not updating correctly each time a new 
 * vehicle is manufactured. Identify and resolve the 
 * problem to ensure that the vehicle count accurately 
 * represents the total vehicles produced, while 
 * maintaining the existing functionality.
 */

abstract class Vehicle:
  val vehicleType: String
  
  def incrementTotalVehicles(): Unit = 
    totalVehicles += 1
  
  def displayTotal() = 
    println(s"Total vehicles manufactured: ${totalVehicles}")
    
object Vehicle
  var totalVehicles: Int = 0

class Car(val vehicleType: String) extends Vehicle:
  incrementTotalVehicles()

@main def run: Unit = 
  new Car("sedan")
  new Car("coupe")
  val hatchback = new Car("hatchback")
  hatchback.displayTotal() // Expected Output: 3
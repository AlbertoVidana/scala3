/**
 * Superb effort on advancing through the Scala module! For your concluding 
 * practice task, you will integrate all the knowledge you've 
 * gained about Scala programming. Imagine your role involves 
 * overseeing the production tracking for a vehicle manufacturing facility. 
 * Your task is to develop a tracking system for various types of vehicles. 
 * Utilize the concepts of abstract classes, companion
 * objects, and class inheritances in Scala. Initiate from the 
 * ground up and skillfully integrate these concepts to 
 * finalize your tracking system.
 */

// TODO: Define an abstract class named Vehicle that takes a String parameter named model and has an abstract method named info.
abstract class Vehicle():
  val model: String
  def info(): Unit =
    println(s"Model: $model")
// TODO: Implement the class Car extending Vehicle. It should have a companion object to maintain the total number of cars.
object Vehicle:
  var totalVehicles: Int = 0
  def createVehicle(): Unit =
    totalVehicles += 1
  
class Car(val model: String) extends Vehicle:
// Inside the Car class, override the info method to increment the car count each time it's called, and return a string with the car's model and the total number of cars.
  Vehicle.createVehicle()
  override def info(): Unit =
    println(s"The model is $model and the total number of cars is ${Vehicle.totalVehicles}")

@main def run: Unit =
  // TODO: Create instances of the Car class and print their information using the info method.
  new Car("SUV")
  new Car("PickUp")
  val sedan = new Car("Sedan")
  sedan.info()
/**
 * Analyze the provided code that demonstrates 
 * the use of an abstract class to define the 
 * base structure of a vehicle, a trait for 
    movement behavior, and a companion object 
    to track the manufacturing progress. 
    Run the code to observe a simplified model 
    of automobile manufacturing and foundational 
    structure implemented in Scala. Note how the 
    paint is defined through the paint method and 
    how the total manufacturing count is updated 
    in the Car companion object.
 */

// Abstract class representing the foundational aspects of a vehicle
abstract class Vehicle:
  var color: String
  def paint(newColor: String): Unit

// Trait for movability
trait Moveable:
  def move(): Unit

// Concrete class implementing the abstract class and trait
class Car(var color: String) extends Vehicle with Moveable:
  def paint(newColor: String): Unit =
    color = newColor
    println(s"The car is now $color")
    
  def move(): Unit =
    println(s"The car with color $color is moving")

// Companion object for Car
object Car:
  var totalCars: Int = 0
  def apply(color: String): Car =
    totalCars += 1
    new Car(color)

@main def run: Unit =
  val car1 = Car("Red")
  car1.paint("Green") // Prints: "The car is now Green"
  car1.move() // Prints: "The car with color Green is moving"
  println(s"Total cars manufactured: ${Car.totalCars}") // Prints: "Total cars manufactured: 1"

  val car2 = Car("Blue")
  car2.move() // Prints: "The car with color Blue is moving"
  println(s"Total cars manufactured: ${Car.totalCars}") // Prints: "Total cars manufactured: 2"
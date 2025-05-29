/**
 * Complete the code to create a vehicle that displays the count of 
 * wheels and prints a message about it in Scala. You'll need to 
 * implement this functionality based on an abstract class 
 * which acts as the blueprint.
 */

abstract class Vehicle:
  val wheelCount: Int
  // TODO: Define an abstract method that prints the number of wheels.

class Car extends Vehicle:
  override val wheelCount = 4
  // TODO: Implement the abstract method to print a message about the car's wheels.

@main def run: Unit =
  val myCar = new Car()
  // TODO: Invoke the method to print the number of wheels.
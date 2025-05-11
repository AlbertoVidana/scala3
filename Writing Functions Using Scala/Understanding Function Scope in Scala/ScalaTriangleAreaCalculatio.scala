/**
 * task, you will strengthen your 
 * Scala proficiency by recreating 
 * the function to calculate the 
 * volume of a sphere. You're tasked 
 * with writing the entire function 
 * from the ground up, including the 
 * constant for Pi, the definition of the 
 * function to compute the volume, and the 
 * execution of the main function call. 
 * Keep in mind the scope of the variables 
 * and output the final result in the specified manner.
 * To find the volume of a sphere, we use the formula: volume = (4/3) * pi * r^3
 */

 import scala.math.pow
// TODO: Declare a global constant for Pi with a value of 3.14159
val Pi = 3.14159

// TODO: Define a function that takes an integer "radius" as a parameter, calculates the volume of the sphere using the constant for Pi, and returns the volume as a double.
def calculateArea(radius: Double): Double = 
  (4.0/3.0) * Pi * pow(radius, 3)
// TODO: Define the main function to print the volume of a sphere with radius 5
// TODO: Expected Output: Volume of the sphere is: 523.5983333333332
@main def run: Unit = 
  val radius = 5
  val circleArea = calculateArea(radius)
  println(s"Volume of a sphere is: $circleArea")
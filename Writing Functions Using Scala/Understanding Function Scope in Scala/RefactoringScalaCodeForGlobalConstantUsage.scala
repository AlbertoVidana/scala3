/**
  * Welcome! Your task is to refactor
  *  the Scala code to utilize a global 
  * Pi constant, replacing its local 
  * definitions in the calculateArea 
  * and calculateCircumference functions. 
  * This shift to a single, globally 
  * accessible Pi aims to show the efficiency 
  * of using global constants to reduce 
  * redundancy and maintain consistency. 
  * Feel free to choose any precision for Pi 
  * that suits your needs. Let's dive in!
  */

  // TODO: Define 'Pi' globally here, making it accessible to both functions below

def calculateArea(radius: Double): Double = 
  3.14 * radius * radius // TODO: Replace this local Pi with the global Pi

def calculateCircumference(radius: Double): Double = 
  val Pi = 3.14159 // TODO: Remove this local Pi and use the global Pi
  2 * Pi * radius

@main def run: Unit = 
  val radius = 5.0
  val circleArea = calculateArea(radius)
  val circleCircumference = calculateCircumference(radius)
  println(s"Area of the circle: $circleArea")
  println(s"Circumference of the circle: $circleCircumference")
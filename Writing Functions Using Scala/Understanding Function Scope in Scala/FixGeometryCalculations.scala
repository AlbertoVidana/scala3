/**
 * Welcome! You're given a code 
 * snippet containing two functions: 
 * one to calculate the area of a 
 * circle, and another to calculate 
 * its circumference. However, the 
 * code has an error! Can you identify 
 * and fix it? Run the code to see the error. 
 * Good luck!
 */

val Pi = 3.14 // Global scope -- a global Pi value accessible by all functions

def calculateArea(radius: Double): Double = 
  Pi * radius * radius // Utilizes the global 'Pi' for calculation

def calculateCircumference(radius: Double): Double = 
  val Pi = 3.14159 // Shadowing Pi variable with a value with higher precision
  2 * Pi * radius

@main def run: Unit = 
  val radius = 5.0
  val circleArea = calculateArea(radius)
  val circleCircumference = calculateCircumference(radius)
  println(s"Area of the circle: $circleArea")
  println(s"Circumference of the circle: $circleCircumference")
/**
 * Welcome to the Scala circle geometry task! 
 * In this exercise, you will calculate 
 * the perimeter and area of circles with 
 * predefined radii. We define Pi as a 
 * global value and two functions to 
 * compute the perimeter and area of a circle. 
 * Execute the code to understand how scope 
 * functions in Scala and to see how local 
 * values in functions run without issues. 
 * Have fun coding!
 */


 val Pi = 3.14

def calcCirclePerimeter(radius: Double): Double =
  val result = 2 * Pi * radius
  result

def calcCircleArea(radius: Double): Double =
  val result = Pi * radius * radius
  result

@main def run: Unit =
  println(s"The perimeter of the circle is ${calcCirclePerimeter(5.0)}")
  println(s"The area of the circle is ${calcCircleArea(7.0)}")
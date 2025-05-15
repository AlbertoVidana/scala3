/**
 * Welcome! In this final task of the unit, 
 * you'll have the opportunity to get creative 
 * by writing a Scala function that simulates 
 * painting a canvas. Follow the TODO instructions 
 * and let's paint something beautiful together!
 */

// TODO: Define the function paintCanvas with the following parameters: 
//       - size (String)
//       - baseColor (String) with a default value of "white"
//       - borderColor (String) with a default value of "black"
//       The function should print a message describing the canvas being painted.
//       Example: "Painting a <size> canvas with <baseColor> color and a <borderColor> border."
def paintCanvas(size: String, baseColor: String = "white", borderColor: String = "black"): Unit =
    println(s"Painting a $size canvas with $baseColor color and a $borderColor border.")

// TODO: In the main method, invoke the paintCanvas function twice using named arguments:
//       - The first call should only specify the size
//       - The second call should specify all parameters
@main def run: Unit =
    paintCanvas(size = "23")
    paintCanvas(size = "32", baseColor =  "red", borderColor = "orange")
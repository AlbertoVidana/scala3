/**
 * Welcome to this task! Let's further apply 
 * your understanding of functions and return 
 *  values by working with temperatures. 
 *  Write a Scala function that takes a list 
 *  of temperature readings in Celsius, converts 
 * them to Fahrenheit, and returns a new list 
 *  containing the Fahrenheit values. In the main 
 *  method, invoke your function with a sample 
 *  list of temperatures and print the converted 
 *  results. Ready to give it a try? Let's go!
 *  Note: In Scala, Lists can be passed as arguments 
 *  to functions just like any other data type. 
 *  The function signature for a function that 
 *  takes a list of Doubles as an argument and 
 *  returns a list of Doubles would be: def 
 *  functionName(arg: List[Double]): List[Double]
 */

// TODO: Write a function 'celsiusToFahrenheit' that converts a temperature from Celsius to Fahrenheit using the formula: (Celsius * 9.0 / 5.0) + 32.0. The input temperature should be a Double, and the function should return a Double.

// TODO: Write a function 'convertTemperatures' that takes a list of Celsius temperatures (as Doubles) and returns a list of Fahrenheit temperatures. Use the 'celsiusToFahrenheit' function within this new function.

// Function signature for 'convertTemperatures'
// def convertTemperatures(temperatures: List[Double]): List[Double]

@main def run: Unit = 
  val celsiusTemperatures = List(0.0, 25.0, 30.0, 100.0)
  // TODO: Call your 'convertTemperatures' function with 'celsiusTemperatures' and print the results
/**
 * Complete the function to return the larger of 
 * two numbers. I believe you'll enjoy this 
 * little challenge to brush up on your Scala skills!
 */

 // Function to calculate the maximum of two numbers (returns the larger one)
def max(num1: Int, num2: Int): Int =
    if (num1 > num2) return num1
    else return num2
  // TODO: Write a return statement that evaluates which number is larger and returns it.

// Main method where max is called
@main def run: Unit =
  // TODO: Call the max function with 10 and 20 as arguments and print the result.
  print(max(1, 2))
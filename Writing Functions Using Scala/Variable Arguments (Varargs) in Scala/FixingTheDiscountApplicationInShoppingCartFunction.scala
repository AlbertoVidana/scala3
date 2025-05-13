/**
 * Welcome! In this task, your challenge is 
 * to fix an error in a Scala function called 
 * calculateTotal. This function is designed 
 * to calculate the total cost of items in a 
 * shopping cart and then apply a discount. 
 * Your mission is to identify and correct 
 * this error so that the function computes 
 * the price accurately. Feel free to run the 
 * provided code to observe the error firsthand. 
 * Happy coding!
 */

 def calculateTotal(discountInPercent: Double, prices: Double*): Double =
  val total = prices.sum // `sum` returns the sum of all the elements
  total * (100 - discountInPercent) / 100

@main def run: Unit =
  val prices = Array(35.0, 45.0, 20.0)
  val totalPrice = calculateTotal(10.0, prices*)
  println(s"Total price is: $totalPrice")
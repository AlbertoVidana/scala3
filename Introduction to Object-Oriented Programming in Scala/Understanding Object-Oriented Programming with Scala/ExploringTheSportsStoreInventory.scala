/**
 * Hey there! Ready to dive into some Scala 
 * coding? Let's explore the properties of a 
 * Tennis Racket in a sports equipment store's 
 * digital record. You'll see how Scala's class 
 * mechanics work by defining a SportsItem with 
 * attributes like type and price. Plus, 
 * there's a nifty method displayInfo to 
 * print out all the details about the item. 
 * Have fun! 
 */

class SportsItem:
  val typeVal: String = "Tennis Racket"
  val priceVal: Double = 79.99

  def displayInfo(): Unit =
    println(s"Item: $typeVal, Price: $$$priceVal")

@main def run: Unit =
  val item = new SportsItem()
  item.displayInfo() // Will print: Item: Tennis Racket, Price: $79.99
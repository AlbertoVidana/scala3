/**
 * Hey there! Ready to put your Scala skills to the test?
 * In this exercise, you'll be simulating a Sports Equipment 
 * Store's inventory management system. You'll create a 
 * SportsItem class with properties for name (a String) 
 * and stock (an Int).
 * 
 * We'll also need a method to handle the sale of an 
 * item (which decrements the stock). 
 * To see your class in action, you'll 
 * create an instance of it, update its properties, 
 * and invoke the method to watch the stock change. 
 * This is a fun and practical way to apply 
 * object-oriented programming in Scala!
 */

// Define the SportsItem class with two properties: name (String) and stock (Int)
// Initialize the properties with default values: name = "Unknown", stock = 0
// Also, create a method named sell that decrements the stock if it's above 0
// and prints a message reflecting the sale or indicating the item is out of stock
// Expected message format: "One <name> sold, <stock> remaining" or "No more <name> in stock"

@main def run: Unit =
  // TODO: Create an instance of the SportsItem class
  // TODO: Update the name property of your instance to "Football"
  // TODO: Update the stock property of your instance to 10
  // TODO: Call the sell method on your instance to simulate selling an item
  // Expected output: "One Football sold, 9 remaining" on the first sale
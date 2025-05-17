/**
 * Hey there, future Scala pro! Now 
 * that you're getting the hang of 
 * classes and objects, let's have 
 * some fun with a little challenge. 
 * Your task is to complete the class 
 * Basketball. Here's what you'll need to do:
 *
 * Define a color attribute with a default 
 * value (let's go with "orange").
 * Create a method that simulates the ball 
 * bouncing with a fun phrase!
 * Ready to dribble into the world of 
 * Scala? Let's get started!
 */

class Basketball:
    def displayInfo(): Unit =
    println(s"Item: $typeVal, Price: $$$priceVal")
  // TODO: Define a color attribute with a default value of "orange".
  // TODO: Create a method named bounce that prints a fun phrase to emulate the basketball bouncing.

@main def run: Unit =
  val storeBasketball = new Basketball()
  println(s"Color of basketball: ${storeBasketball.color}")
  storeBasketball.bounce()  // This line should call your bounce method
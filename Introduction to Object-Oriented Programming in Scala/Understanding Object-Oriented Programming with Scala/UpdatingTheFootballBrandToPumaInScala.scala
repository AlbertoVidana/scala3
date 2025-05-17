/**
 * Update the brand of the football 
 * from "Adidas" to "Puma". This will 
 * help you practice modifying properties 
 * in Scala classes. Implement the change 
 * and ensure all other functionality 
 * remains as it is.
 */

// TODO: Change the default football brand from "Adidas" to "Puma".

class Football:
  var brand: String = "Adidas"
  val material: String = "Synthetic leather"

  def bounce(): Unit =
    println("The football bounces!")

@main def run: Unit =
  val storeFootball = new Football()
  println(s"This football is made of ${storeFootball.material} and the brand is ${storeFootball.brand}.")
  storeFootball.bounce()
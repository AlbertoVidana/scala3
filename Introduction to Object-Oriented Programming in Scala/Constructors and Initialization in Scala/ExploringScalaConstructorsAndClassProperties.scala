/**
 * Learn about Scala primary and auxiliary 
 * constructors! Observe the differences 
 * between a class with an explicit primary 
 * constructor, and one with shorthand 
 * syntax (primary constructor with 
 * parameters defined in the class definition). 
 * Run the code below to see how Scala initializes 
 * objects and how you can update mutable 
 * properties post-creation.
 */

class Car(val color: String, var brand: String):
  println(s"Creating a new Car: $color $brand")

  // Auxiliary constructor that defaults the brand value
  def this(color: String) =
    this(color, "Unknown")
    println(s"Creating a new Car with default brand: $color")

class Bike(val color: String, var brand: String):
  println(s"Creating a new Bike: $color $brand")

@main def run: Unit =
  val myCar = new Car("red", "Toyota")
  myCar.brand = "Honda" // Changing mutable property
  println(s"My car's brand after change: ${myCar.brand}") // Output: "My car's brand after change: Honda"

  // Using the auxiliary constructor to create a Car object without specifying the brand
  val mySecondCar = new Car("black")
  println(s"My second car's color and default brand: ${mySecondCar.color} ${mySecondCar.brand}") // Output: "My second car's color and default brand: black Unknown"

  val myBike = new Bike("blue", "Trek")
  myBike.brand = "Giant" // Changing mutable property
  println(s"My bike's color and brand after change: ${myBike.color} ${myBike.brand}") // Output: "My bike's color and brand after change: blue Giant"
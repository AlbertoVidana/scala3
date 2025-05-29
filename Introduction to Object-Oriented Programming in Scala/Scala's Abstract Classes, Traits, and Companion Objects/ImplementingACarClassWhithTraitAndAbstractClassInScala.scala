/**
 * You've learned how Traits and Abstract Classes assist in defining 
 * the behaviors and properties of objects in Scala. 
 * Now, let's apply that knowledge! Your task is to create a
 * Car class which extends the abstract Vehicle class and 
 * mixes in the Manufacturable trait, following our 
 * lessons on Abstract Classes and Traits. 
 * Ensure you give your car a unique way to 
 * start its engine and to be manufactured.
 */

abstract class Vehicle(val wheels: Int):
    def startEngine(): String

trait Manufacturable:
    def manufacture(): String

// TODO: Create a class Car which extends the abstract Vehicle class and mixes in the Manufacturable trait
class Car(override val wheels: Int, val model:String) extends Vehicle(wheels) with Manufacturable:
    def startEngine(): String = s"Engine started for $model"
    
    def manufacture(): String = s"Manufacturing a $model with $wheels wheels"

@main def run: Unit =
    val car = new Car(4, "Sedan")
    println(car.startEngine()) // Expected Output: "Engine started for Sedan"
    println(car.manufacture()) // Expected Output: "Manufacturing a Sedan with 4 wheels"
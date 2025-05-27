/**
 * In this exercise, you'll expand the Dog 
 * class in our Pet Adoption Center scenario to 
 * better portray Buddy the Dog's exuberant expressions. 
 * Your task is to implement a bark method that mirrors 
 * Buddy's zestful nature. This new method should 
 * complement the existing showAffection method 
 * to fully capture his energetic spirit.
 */

abstract class Pet(val name: String):
  def showAffection(): Unit =
    println(s"$name shows affection in its own unique way.")

class Dog(name: String) extends Pet(name):
  // TODO: Add a function bark here that prints "<name> barks: Woof woof!"
  def bark(): Unit =
    println(s"$name barks: Woof woof!")

  override def showAffection(): Unit =
    println(s"$name wags its tail to show affection.")

@main def run: Unit =
  val myDog = new Dog("Buddy")
  myDog.showAffection()
  myDog.bark() // Expected output: "Buddy barks: Woof woof!"
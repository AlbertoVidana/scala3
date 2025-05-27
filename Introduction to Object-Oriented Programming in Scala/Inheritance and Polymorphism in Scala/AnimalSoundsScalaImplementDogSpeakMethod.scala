/**
 * In this Scala exercise, we navigate through object-oriented 
 * programming! Imagine we are at a Pet Adoption Center, and 
 * you're tasked to add a missing method in the Dog class 
 * which will reflect the distinctive way dogs communicate. 
 * Remember, each animal has its unique sound. 
 * Define this method using the OOP concepts you've learned.
 */

class Animal(val name: String):
  def speak(): Unit = 
    // Default implementation (if needed)
    println(s"$name speak.")

class Dog(name: String) extends Animal(name):
  // TODO: Implement the method to define how a dog speaks
  override def speak(): Unit = 
  println(s"$name barks.")

@main def run: Unit = 
  val adoptedPet = new Dog("Buddy")
  adoptedPet.speak() // Expected output: "Buddy barks."
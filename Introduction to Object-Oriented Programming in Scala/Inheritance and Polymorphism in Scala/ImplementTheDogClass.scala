/**
 * Create a Dog class that inherits from the Animal 
 * class in the context of a Pet Adoption Center. 
 * Your task is to add a new method, givePaw, which 
 * represents the dog performing the action of giving a paw.
 */

class Animal(val species: String):
  def sound() = 
    println(s"This $species makes a sound")

// TODO: Create the Dog class that inherits from Animal and add the "givePaw" method
class Dog(species: String) extends Animal(species):
  def givePaw(): Unit =
    println("This dog gives a paw")

@main def run: Unit =
  val myDog = new Dog("Canine")
  myDog.sound()  // Expected Output: "This Canine makes a sound"
  myDog.givePaw()  // Expected Output: "This dog gives a paw"
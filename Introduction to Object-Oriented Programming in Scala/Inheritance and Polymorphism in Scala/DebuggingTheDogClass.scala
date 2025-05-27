/**
 * Let's test your understanding of Scala's 
 * inheritance and method overriding. In the 
 * supplied starter code for a pet adoption 
 * center application, a Dog class tries to 
 * override the sound method to showcase its 
 * unique sound. However, a bug is hindering 
 * it from working as desired. Your task is to 
 * pinpoint and rectify the bug to make sure 
 * that our Dog instance emits its distinctive 
 * sound accurately.
 */

class Animal(val name: String):
  def sound(): Unit =
    println("The animal makes a sound.")

class Dog(name: String) extends Animal(name):
  // BUG: Should override the sound method
  def makeSound(): Unit =
    println(s"$name barks.")
    
  override def sound(): Unit = 
    println(s"$name barks.")

@main def run: Unit =
  val myDog = Dog("Buddy")
  myDog.sound() // Expected output: "Buddy barks."
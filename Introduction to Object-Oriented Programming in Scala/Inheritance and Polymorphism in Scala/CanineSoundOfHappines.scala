/**
 * In our pet adoption center scenario, 
 * let's focus on a specific action: recognizing 
 * the sound a dog makes when it's happy. 
 * The given code demonstrates how to create 
 * a Dog class that inherits from an Animal class, 
 * utilizing the constructor parameter species to 
 * identify the animal type, and overrides the 
 * sound method to reflect the noise a dog makes. 
 * Run the code to hear the sound of happiness 
 * from our canine friend!
 */

class Animal(val species: String):
    def sound(): Unit =
        println(s"This $species makes a sound.") // Generic sound for any animal

class Dog(species: String) extends Animal(species):
    override def sound(): Unit =
        println(s"The $species barks.") // Specific sound for a dog

@main def run: Unit =
    val adoptedPet = new Dog("Canine")
    adoptedPet.sound() // Outputs: The Canine barks.
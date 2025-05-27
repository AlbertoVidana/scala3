/**
 * Create a simple inheritance hierarchy to 
 * model pets in the Scala language. 
 * Define a Pet class for the base of the 
 * hierarchy, and then define a Dog 
 * class that inherits from Pet. 
 * Use method overriding in the Dog 
 * class to provide a unique way for a dog to introduce itself. 
 * Can you bring these pets to life with their unique intros?
 */

// TODO: Define the 'Pet' class which can be inherited
class Pet(val name: String):
// TODO: Add a property 'name' and a method 'introduce()' to the 'Pet' class that prints "I am a pet named [pet's name]."
    def introduce(): Unit =
        println(s"I am a pet named $name")

// TODO: Define the 'Dog' class that inherits from 'Pet'
class Dog(name: String) extends Pet(name):
// TODO: Override the 'introduce()' method in the 'Dog' class to make it print "Woof! I'm a dog named [dog's name]."
    override def introduce(): Unit = 
        println(s"Woof! I'm a dog named $name")
// TODO: In the main object, create an instance of the 'Dog' class and call its 'introduce()' method
@main def run: Unit = 
    val dog = new Dog("Bob")
    dog.introduce()
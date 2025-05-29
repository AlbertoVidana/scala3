/**
 * In the realm of automobile production, it's crucial 
 * to not just focus on each car's details but 
 * also to acknowledge their role in overall manufacturing output. 
 * Your task involves enhancing the drive() 
 * method in the Car class so that it reports the 
 * total number of automobiles produced whenever a car is driven. 
 * This change will connect each car's individual 
 * actions with the collective production data.
 */

abstract class Automobile:
  val brand: String
  def drive(): Unit

object Automobile:
  var totalAutomobiles: Int = 0
  def createAutomobile(brand: String): Automobile =
    totalAutomobiles += 1
    new Car(brand) // Assume Car is a concrete implementation of Automobile.

class Car(val brand: String) extends Automobile:
  def drive(): Unit =
    // TODO: Enhance this method to report the total number of automobiles manufactured.
    println(s"The $brand car drives smoothly. Total number of automoviles manufactured: ${Automobile.totalAutomobiles}")

@main def run: Unit =
  val sportsCar: Automobile = Automobile.createAutomobile("Sports")
  sportsCar.drive()
  println(s"Total automobiles manufactured: ${Automobile.totalAutomobiles}")
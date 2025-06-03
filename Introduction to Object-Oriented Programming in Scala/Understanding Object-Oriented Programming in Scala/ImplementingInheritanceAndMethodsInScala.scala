/**
 * Complete the code to demonstrate your understanding 
 * of inheritance and methods in Scala. 
 * Think about how a software developer operates within a company.
 */

abstract class Employee(var name: String, protected var salary: Double):
  def work(): Unit
  // TODO: Implement a method to display the salary. Think about making it user-friendly.
    println(s"Employee: $name have a salary of $salary")

class SoftwareDeveloper(name: String, salary: Double) extends Employee(name, salary):
  def work(): Unit = 
    // TODO: Describe the work of a software developer using action words. Think about showing coding activity.
    println(s"$name works as a Software Developer, her/his activities inclue coding, commiting and testing.")
    
  def displaySalary(): Unit =
    println(s"The salary of $name is $salary")

@main def run: Unit = 
  val developer = SoftwareDeveloper("Alice", 60000.0)
  developer.work() // Expected Output: "Alice is coding software"
  developer.displaySalary() // Expected Output: "The salary of Alice is 60000.0"
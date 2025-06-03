/**
 * Improve your understanding of inheritance in Scala by 
 * refining the Manager class. You should override the 
 * work method of the Employee class to embody the unique 
 * responsibilities of a Manager, which encompass 
 * team leadership, supervising workflows, strategic 
 * planning, and execution. Ensure that the message 
 * printed follows the format: "[name] manages the 
 * team, workflows, plans, and strategizes". 
 * This task serves as a practical example of method 
 * overriding in object-oriented programming, illustrating 
 * the way subclasses can modify and detail 
 * the methods inherited from their superclasses.
 */

class Employee(val name: String, val role: String):
  def work(): Unit =
    println(s"$name works as a $role.")

class Manager(name: String) extends Employee(name, "Manager"):
  // TODO: Override the `work` method to print: "[name] manages the team, workflows, plans, and strategizes"
  override def work(): Unit = 
    println(s"$name manages the team, workflows, plans, and strategizes")

@main def run: Unit =
  val manager1: Employee = new Manager("Alice")
  manager1.work()  // Expected output: Alice works as a Manager.

  val manager2: Employee = new Manager("Bob")
  manager2.work()  // Expected output: Bob works as a Manager.
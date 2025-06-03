/**
 * Learn how inheritance and polymorphism 
 * function together in the Scala language 
 * by exploring a simple hierarchy of classes 
 * that represent different types of employees 
 * within a company. The given code defines 
 * how a ProjectManager introduces themselves 
 * distinctively from a generic employee. 
 * Run the code to see polymorphism in action!
 */


abstract class Employee(var name: String):
  def introduce(): Unit =
    println(s"Hello, my name is $name.")

class Manager(name: String) extends Employee(name):
  def holdMeeting(): Unit =
    println("Meeting with the team is now in session.")

class ProjectManager(name: String) extends Manager(name):
  override def introduce(): Unit =
    println(s"Hello, I am the Project Manager and my name is $name.")

@main def run: Unit =
  val projectManager = new ProjectManager("Alice")
  projectManager.introduce()  // Prints: "Hello, I am the Project Manager and my name is Alice."
  projectManager.holdMeeting()  // Prints: "Meeting with the team is now in session."
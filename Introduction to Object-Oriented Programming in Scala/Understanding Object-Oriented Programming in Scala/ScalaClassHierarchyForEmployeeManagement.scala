/**
 * Create a program for a Software Corporation 
 * that can add and display its staff members. 
 * Use your understanding of encapsulation and inheritance 
 * in Scala to implement this from scratch. 
 * Write classes and methods focusing on 
 * properly utilizing accessibility modifiers and class structures.
 */

// TODO: Define a `SoftwareCorporation` class that can store Employee objects. Include methods to add an employee to the employee list and to display all employee names.
import scala.collection.mutable.ListBuffer

class SoftwareCorporation():
    val employeeList: ListBuffer[Employee] = ListBuffer()
    def addEmployee(employee: Employee): Unit = 
        employeeList += employee
        
    def showEmployee(): Unit =
        for (i <- 0 to employeeList.size -1) {
            var employeeTem = employeeList(i)
            println(employeeTem.name) 
        }
// TODO: Define an `Employee` class with a name and a salary. Make sure the name is accessible for inheritance but the salary remains private. Include a method to get the employee's name for displaying.
class Employee(val name: String):
    private var salary: Double = 0.0
    val employeeName: String = name
    
    def setSalary(value: Double): Unit = 
        if value > 0 then
            salary = value
            showSalary()
    
    def showSalary(): Unit = 
        println(s"New Employee: $name. Salary: $salary")

// TODO: In the `Main` object, create an instance of the `SoftwareCorporation` class.
@main def run: Unit =
    val softwareCorporation = SoftwareCorporation()

// TODO: Create an instance of the `Employee` class and add this instance to your `SoftwareCorporation` instance using the appropriate method.
    val employee1 = new Employee("Employee 1")
    employee1.setSalary(80000.00)
    
    softwareCorporation.addEmployee(employee1)
    
    val employee2 = new Employee("Employee 2")
    employee2.setSalary(180000.00)
    
    softwareCorporation.addEmployee(employee2)

// TODO: Call the method on your `SoftwareCorporation` instance that prints the names of all employees.
    softwareCorporation.showEmployee()
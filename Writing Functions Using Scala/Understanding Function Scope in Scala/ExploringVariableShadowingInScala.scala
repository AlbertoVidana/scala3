/**
 * Welcome to the practice exercise on a 
 * fundamental concept in Scala programming: 
 * variable shadowing. In this task, 
 * you'll work with a scenario where 
 * you calculate the area of a circle. 
 * We have a global pi variable defined 
 * with a low precision value. Your 
 * task is to shadow this global variable 
 * within a specific function to increase 
 * the precision of your calculation 
 * without changing the global scope.
 */

val pi = 3.14

def calculateApproxArea(radius: Double): Double = 
    pi * radius * radius

def calculatePreciseArea(radius: Double): Double = 
    // TODO: Shadow the global 'pi' variable with a higher precision value 3.14159265
    val pi = 3.14159265
    pi * radius * radius

@main def run: Unit = 
    val radius = 5.0
    val areaLowPrecision = calculateApproxArea(radius)
    val areaHighPrecision = calculatePreciseArea(radius)
    println(s"Area with low precision: $areaLowPrecision")
    println(s"Area with high precision: $areaHighPrecision")
package DataStructures.unit1

/**
 * Scala Subway Line Final Stop Update
 * 
 * Hello, Scala enthusiast! Ready to take your 
 * Scala skills for a ride on the subway? Your task is to 
 * replace the TODO comment with code that dynamically 
 * retrieves and displays the name of the subway’s final destination. 
 * Ensure you do not hardcode the name of the last stop or its index. 
 * Ready to depart? Let’s get started!
 */

 @main def practice4: Unit =
  val subwayStops = Array("Central", "Park Street", "Kendall", "Charles/MGH", "Downtown Crossing")
  println(s"Total subway stops: ${subwayStops.length}")
  println(s"First stop on the line: ${subwayStops.head}")
  println(s"Last stop on the line: ${subwayStops.last}")
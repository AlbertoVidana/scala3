package ControlStructures

/**
 * Budget-Friendly Flight Finder in Scala
 * 
 * Let's test your Scala skills! Pretend that you're 
 * designing a feature for a flight search engine 
 * which displays only the flights that are under 
 * a certain budget. Write Scala code to count and 
 * show how many flights fall within a given budget.
 *
 * Expected Messages Format
 * For each affordable flight: Flight for $<price> is within budget.
 * For the total count: There are <count> affordable flights available.
 */

object Main3 extends App {
    val flights = List(650, 1200, 2900, 3400, 4100)
    val budget = 3000
    var countAffordable = 0
    for (price <- flights) {
        /* 
         TODO: Check if the flight price is within budget and print a 
         message in the format "Flight for $<price> is within budget." if it is.
         Also, keep track of how many affordable flights are available.
        */
        if (price <= budget) {
            println(s"Flight for $price is within budget.")
            countAffordable+=1
        }
    }
    /* 
     TODO: Print the total count of affordable flights in the format 
     "There are <count> affordable flights available."
    */
    print(s"There are $countAffordable flights available.")
}

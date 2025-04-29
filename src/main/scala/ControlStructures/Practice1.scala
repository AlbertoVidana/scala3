package ControlStructures

/**
 * Flight Distance Filter
 * 
 * In this exercise, your task is to find and 
 * display all flights within a specified range 
 * for a flight-booking system. We provide you 
 * with a sequence of flight distances and a maximum 
 * affordable distance. Execute the code to 
 * determine which flights are suitably close!
 */

object Main1 extends App {
  // Given flight distances as a List and a maximum affordable distance
  val flightDistances = List(1200, 1500, 800, 2200, 1600)
  val maxDistance = 1500

  // 'for' loop with 'if-else' that prints flights within the range using a List
  for (distance <- flightDistances) {
    if (distance <= maxDistance) {
      println(s"Flight with distance $distance km is within range.")
    } else {
      println(s"Flight with distance $distance km is too far.")
    }
  }
}
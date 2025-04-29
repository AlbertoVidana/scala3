package ControlStructures

/**
 * Scala Skies: Identifying VIP Passengers
 * 
 * Let's take a moment to focus on our Scala-based flight booking system. 
 * We have special passengers who deserve extra attention.
 * Here, we will use the match case construct in Scala to single out VIP 
 * passengers who are occupying seats 12 and 19. Ensure you give these 
 * select passengers a personalized message to enhance their flying 
 * experience. Replace the existing if condition with the match case 
 * construct and add the conditions for VIP passengers.
 * Message for VIP Passengers:
 * "VIP Passenger at seat 12 gets a premium view on the flight to Paris."
 * "VIP Passenger at seat 19 gets a premium view on the flight to Paris."
 */

 object Main2 extends App {
    val destination = "Paris"
    val seatNumbers = List(12, 15, 19, 24) // Seat numbers for passengers
    for (seat <- seatNumbers) {
        // TODO: Replace the if conditions below with a match case construct and add conditions for VIP passengers
        if (seat % 2 == 0) {
            println(s"Passenger at seat $seat gets a window view on the flight to $destination.")
        } else {
            println(s"Passenger at seat $seat gets an aisle view on the flight to $destination.")
        }
    }
}
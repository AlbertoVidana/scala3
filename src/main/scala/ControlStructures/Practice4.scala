package ControlStructures

/**
 * light Scheduler in Scala
 * 
 * You're nearly ready to take off, Space Voyager! 
 * Your final mission is to assist with managing 
 * a flight booking system. Implement a Scala 
 * application that assigns flights to their 
 * respective actions on different days. Utilize a 
 * for loop and a match control structure to 
 * book flights for the weekdays. Keep in mind, 
 * flight bookings do not occur on weekends!
 */

 object SpaceVoyager {
  def main(args: Array[String]): Unit = {
    // TODO: Define an array containing the weekdays when flights can be booked.
    val dayOfWeek = List(1, 2, 3, 4, 5)
    // TODO: Use a for loop to iterate over the weekdays.
    
    /*
     * TODO: Inside the loop, use a 'match' expression to determine which flight to book on each day.
     * E.g., on Monday or Wednesday book a flight A305, and on Tuesday or Thursday book flight B814.
     */
     for (day <- dayOfWeek) {
      day match
        case 1 | 3 => println("Book a flight A305")
        case 2 | 4 => println("Book a flight B814")
        case 5 => println("Book a flight C614")
        case _ => println("Fligth booking only during week days")
     }
  }
}
package For

/**
 * Subject List Printer with Indexes
 * 
 * List each subject along with its corresponding order 
 * number in the list. Use a for loop, and Scala's 
 * zipWithIndex method to output the messages in the 
 * format "1. I have Math class today." to neatly 
 * combine the subject's name with its position in the list.
 */

 object Main4 extends App {
  val subjects = List("Math", "Science", "History", "Art")

  // TODO: Iterate over each subject and its index in the list and print a message including the subject name and its ordinal position
  for ((subject, index) <- subjects.zipWithIndex) {
    println(s"${index + 1}. I have class of $subject today")
  }
}
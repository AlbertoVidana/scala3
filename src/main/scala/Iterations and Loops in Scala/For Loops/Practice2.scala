package `Iterations and Loops in Scala`.`For Loops`

/**
 * Expanding Scala Ranges
 * 
 * Modify the range in the simpleCounting value to 
 * count from 1 to 5 instead of just up to 3. 
 * This change allows you to practice for 
 * loops and ranges in Scala.
 */

 object Main2 extends App {
  val simpleCounting = 1 to 5
  for (number <- simpleCounting) {
    println(s"${number}: Learning is fun!")
  }
}
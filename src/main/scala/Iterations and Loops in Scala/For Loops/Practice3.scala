package `Iterations and Loops in Scala`.`For Loops`

/**
 * Loop Correction: Printing "Paper" Five Times
 * 
 * The code provided is supposed to output the word "paper" five times. 
 * However, it currently does so less frequently. 
 * Your task is to identify the issue and adjust the 
 * code so that "paper" appears exactly five times. 
 * Execute the provided code to see the current behavior.
 */

 object Main3 extends App {
  // Loop to print the word "paper" five times
  val item = "paper"
  for (i <- 0 until 5) { 
    println(s"$i. $item")
  }
}
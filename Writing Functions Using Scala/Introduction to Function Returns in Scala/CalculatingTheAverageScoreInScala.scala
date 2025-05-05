/**
 * Welcome! For this task, you'll calculate the 
 * average of three scores in a Math class. 
 * No coding is required; simply observe the 
 * process. Click Run to see how 
 * the calculation is carried out!
 */

 def calculateAverage(score1: Int, score2: Int, score3: Int): Double = 
  // Adds the three scores and returns the average.
  (score1 + score2 + score3) / 3.0

@main def run: Unit = 
  // Print the average of these three scores: 75, 88, 92
  println(s"The average score is: ${calculateAverage(75, 88, 92)}")
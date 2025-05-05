/**
 * Hello👋 I have a piece of code designed 
 * to calculate the average score from three 
 * test results, but it seems to be producing 
 * unexpected results. Can you help identify the 
 * problem and correct it? Let's work together 
 * to get it right!
 */

 def calculateAverageScore(score1: Int, score2: Int, score3: Int): Int =
  // This function takes three test scores and returns the average score.
  (score1 + score2 + score3) / 3

@main def run: Unit =
  // Example scores: math, science, and history tests.
  println(calculateAverageScore(81, 90, 85)) // Expected output: 85.33
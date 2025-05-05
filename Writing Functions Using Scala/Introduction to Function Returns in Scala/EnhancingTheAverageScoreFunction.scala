/**
 * Hello! In this task, you'll enhance the 
 * calculateAverageScore function to return a 
 * more user-friendly message with the 
 * average score, rather than just a number. 
 * You'll need to modify the return type and 
 * the return statement accordingly. 
 * Let's make it more engaging and easy to understand!
 */

 // TODO: Enhance this function to return a user-friendly message with the average score
def calculateAverageScore(score1: Int, score2: Int, score3: Int): Double = 
    (score1 + score2 + score3) / 3.0

@main def run: Unit = 
    // Print the average score for three test results
    println(calculateAverageScore(70, 85, 90)) // Expected Output: "The average score is: 81.66666666666667"
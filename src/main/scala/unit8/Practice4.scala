package unit8

/**
 * Create an update string for a user's social media activity using string 
 * interpolation, a common requirement for generating dynamic content in web development. 
 * Combine variables and text to simulate a real-world use case in Scala.
 */

 @main def practice4: Unit =
    val user = "Alice"
    val likeCount = 3
    val comment = "Lovely picture!"

    // TODO: Create a string using string interpolation to show the user's update with likes and comment
    val socialUpdate = s"$user, your comment: $comment has been like by ${likeCount.toInt}"
    println(socialUpdate)

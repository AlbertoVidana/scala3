package unit8

/**
  * Let's put your Scala string concatenation and interpolation knowledge 
  * into practice by creating a custom social media update. 
  * Concatenate and interpolate strings in Scala to produce a unique social media post. 
  * Are you ready to apply your string manipulation expertise?
  */


  @main def practice6: Unit =
    // TODO: Declare a variable for the user's name and assign it a value
    val userName: String = "Alberto"
    // TODO: Declare a variable for the post text and assign it a value
    val postText: String = "Hellow World!"
    // TODO: Use string interpolation to combine userName and postText into a social media post
    val mediaPost: String = s"Hellow $userName, your social media post: $postText have been liked by ..."
    // TODO: Print out the final social media post message
    println(mediaPost)
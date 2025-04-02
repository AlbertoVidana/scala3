package unit8

/**
 * Great job exploring string concatenation and interpolation in Scala! 
 * But it looks like there's a little snag in the current code: 
 * it's not producing the correct total number of likes.
 * Could you identify and resolve the issue?
 */

 @main def run3: Unit =
  val user = "Alex"
  val likes = "42"
  val postMessage = s"Your post has been liked by $user!"

  val likesMessage = s"Your post now has ${likes.toInt + 1} likes."
  println(postMessage)
  println(likesMessage)

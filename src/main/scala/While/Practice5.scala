package While

/**
 * Baking a Dozen Cookies with Scala While Loops
 * 
 * Hello, aspiring baker! Write a Scala 
 * program to simulate the process of 
 * baking cookies until you have exactly 
 * 12 cookies. This is an opportunity 
 * to demonstrate how to use Scala While Loops. 
 * Good luck and happy coding!
 */

 object Baker {
  def main(args: Array[String]): Unit = {
    // TODO: Define a variable to keep track of the number of cookies baked.
    var cookiesBaked = 0
    // TODO: Write a while loop that continues baking until you have a dozen cookies.
    // Within the loop, print each step of baking a cookie and increment the cookie counter.
    while (cookiesBaked < 12) {
      println(s"Baking cookie number: ${cookiesBaked + 1}")
      cookiesBaked = cookiesBaked + 1
    }
  }
}

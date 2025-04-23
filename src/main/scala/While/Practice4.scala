package While

/**
 * Scala Bakery: Looping Through Cookies
 * 
 * Welcome to the Scala Bakery! Your task is to 
 * continue baking cookies. Complete the code 
 * to keep track of the cookies as you bake 
 * them, until you have a total of five cookies. 
 * Good luck, and have fun baking!
 */

 object Main4 extends App {
  var cookiesBaked = 0
  // Keep baking cookies until we have 5 on the plate
  while(cookiesBaked < 5) {
    println(s"Baking cookie number: ${cookiesBaked + 1}")
    /* TODO: Write the code to update the number of cookies baked */
    cookiesBaked += 1
  }
}

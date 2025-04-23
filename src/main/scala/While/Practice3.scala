package While

/**
 * Bake a Dozen Cookies in Scala
 * 
 * There's a Scala program designed to bake 
 * cookies until we have exactly a dozen. 
 * Unfortunately, it seems like it's not 
 * producing the right number of cookies. 
 * Could you identify and fix the issue?
 */

 object Main3 extends App {
    var cookiesBaked = 1
    while(cookiesBaked <= 12) {
        println(s"Baking cookie number: $cookiesBaked")
        // Oops, looks like we missed something here...
    }
}
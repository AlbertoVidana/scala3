/**
 * In this task, you're dealing with a 
 * code segment intended for managing an 
 * inventory in a squash equipment store. 
 * The program is supposed to output the 
 * type of a SquashBall and then simulate a bounce. 
 * Unfortunately, there's an error preventing the 
 * code from executing properly. Identify and correct 
 * the mistake to get it running correctly.
 */

class SquashBall:
    val typeOfBall: String = "fast"
    def bounce(): Unit =
        println("The squash ball bounced!")

@main def run: Unit =
    val myBall = SquashBall
    println(myBall.typeOfBall) // should print "fast"
    myBall.bounce()            // should print "The squash ball bounced!"
/**
 * Modify the visibility of the checkBalance method in the PiggyBank 
 * class so that it can be called from outside the class. 
 * You need to change its visibility to public. 
 * Call checkBalance() from the main function 
 * to test its visibility after adding some 
 * money to your piggy bank. This exercise will 
 * give you insight into method visibility in Scala.
 */

class PiggyBank:
    private var balance: Double = 0.0

    def addCoin(value: Double): Unit =
        if value > 0 then
            balance += value
            checkBalance()

    def checkBalance(): Unit =
        println(s"Current balance is: $balance")

@main def run: Unit =
    val myPiggyBank = PiggyBank()
    myPiggyBank.addCoin(50.0)
    // Try to call checkBalance() here to see if it works.
    myPiggyBank.checkBalance()
/**
 * Explore how a Savings Account functions by 
 * looking at a simple Scala implementation. 
 * Run the code to see how encapsulation in Scala 
 * ensures the protection of the account balance, 
 * while still allowing for operations 
 * like deposits to occur.
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
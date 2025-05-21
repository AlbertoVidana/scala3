/**
 * Implement the custom getter and setter for 
    the balance variable of the SavingsAccount 
    class in Scala. The getter should print 
    "Accessing account balance" and return the current balance. 
    The setter should update the balance and print 
    "Updating account balance to [new balance]". 
    This will aid in maintaining transparency of 
    transactions in our banking application.
 */

class SavingsAccount(initialBalance: Double):
    private var _balance: Double = initialBalance
    
    def balance: Double =
        // TODO: Implement the getter to log "Accessing account balance" and return the current balance
        println("Accessing account balance")
        balance_

    def balance_=(value: Double): Unit =
        // TODO: Implement the setter to log "Updating account balance to [new balance]" and update the balance
        println(s"Updating account balance to $value")
        _balance = value

@main def run: Unit =
    val savings = new SavingsAccount(1000.0)
    savings.balance = 1200.0 // Expected output: "Updating account balance to 1200.0"
    println(savings.balance)  // Expected output: "Accessing account balance"
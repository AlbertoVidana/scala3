/**
  * Create a PiggyBank class in Scala that 
  * encapsulates the idea of a piggy bank. 
  * It should privately store the amount of 
  * money saved and provide functionality to 
  * add a valid positive amount to the balance. 
  * The class should also have a method to display 
  * the current balance without directly giving access 
  * to the internal funds. Secure those savings with 
  * good encapsulation practices!
  */

  class PiggyBank:
    // TODO: Define a private variable to store the amount in the piggy bank
    private var balance: Double = 0.0
    // TODO: Create an "addMoney" method that validates and adds money to the piggy bank, and then prints out the amount added
    def addMoney(value: Double): Unit =
        if value > 0 then
            balance += value
            showBalance()
    // TODO: Create a "showBalance" method to display the balance of the piggy bank without exposing the amount variable
    def showBalance(): Unit =
        println(s"Current balance is: $balance")

@main def run: Unit =
    // TODO: Create an instance of PiggyBank
    val piggyBank = PiggyBank()
    // TODO: Call the addMoney method with a positive amount
    piggyBank.addMoney(100.00)
    // TODO: Call the showBalance method to display current balance
    piggyBank.showBalance()
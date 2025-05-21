/**
  * You are tasked with refining a digital savings account's 
  * code within our virtual bank simulation written in Scala. 
  * The current code isn’t enforcing the rules against 
  * negative balances. Your job is to implement balance 
  * validation logic to ensure that negative 
  * balances are not allowed.
  */

class SavingAccount(initialBalance: Double):
  private var _balance: Double = initialBalance

  def balance: Double = _balance

  def balance_=(value: Double): Unit =
    if (value < 0) {
      println("Invalid amount")
    } else {
      println("New balance set")
      _balance = value
    }

  def showBalance(): Unit =
    println(s"The balance is: $balance")

@main def run: Unit =
  val account = new SavingAccount(1000.0)
  account.showBalance()  // Expected output: "The balance is: 1000.0"
  account.balance = 1200.0  // Expected output: "New balance set"
  account.showBalance()  // Expected output: "The balance is: 1200.0"
  account.balance = -100.0  // Expected output: "Invalid amount"
  account.showBalance()  // Expected output: "The balance is: 1200.0"
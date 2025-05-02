/**
  * Now let's add another feature to our home 
  * automation system: a function that will welcome 
  * the homeowner back. Implement a function that 
  * outputs a welcome message when you return 
  * home. I hope you enjoy this small, heartwarming 
  * addition!
  */

  def activateCleaningMode(): Unit =
  println("Cleaning mode activated. Let's clean the house!")

// TODO: Define a function that prints a welcome back message for the user.
def welcomeHome(): Unit = 
  // Write a message here
  print("Welcome back!")

@main def run: Unit =
  activateCleaningMode()
  // TODO: Call the function to welcome the user back home.
  welcomeHome()
@main def hello(): Unit =
  val metalPrice = 50
  var credits = 40
  val canAffordMetal = credits >= metalPrice && metalPrice % 10 == 0
  println(s"Transaction status: $canAffordMetal") // Expected output: "Transaction status: false"
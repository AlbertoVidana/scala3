package unit8

/**
 * Mastering String Concatenation and Interpolation in Scala
 */


@main def run: Unit =
  val apples = 5
  val oranges = 10
  val message = s"You have ${apples + oranges} fruits in total."  // Expression interpolated in the string
  println(message)  // You have total 15 fruits.

  /*
  @main def run: Unit =
  val quote = "He said, \"Hello, World!\""  // Using escape character to include double quotes in the string
  println(quote)  // He said, "Hello, World!".

  @main def run: Unit =
  val filePath = """C:\Users\John\Documents"""  // Backslashes do not need to be escaped in a raw string
  println(filePath)  // C:\Users\John\Documents

  @main def run: Unit =
  val userName = "John Doe"
  val filePath = s"""C:\\Users\\$userName\\Documents"""  // Using `s` to include variables in raw strings
  println(filePath)  // C:\Users\John Doe\Documents

  @main def run: Unit =
  val poem = """Roses are red,
  Violets are blue,
  Scala is awesome,
  And so are you!"""  // Multiline string using raw strings
  println(poem)
  // Roses are red,
  // Violets are blue,
  // Scala is awesome,
  // And so are you!

  */
package unit8

/**
 * Welcome! In this task, you will convert the string representation of a receipt 
 * from a standard string to a raw string. The provided starter code has a receipt 
 * string that utilizes escape sequences for newlines and double quotes. 
 * Your task is to rewrite this receipt string using a raw string to make 
 * the code cleaner and easier to read. 
 * Use raw string interpolation to handle variables inside the string, and ensure 
 * the raw string does not use escape sequences like \n for newlines or \" for double quotes. 
 * Focus on performing minimal changes, converting the string to a raw string without 
 * modifying other parts of the code unnecessarily.
 */

 @main def practice5: Unit =
    val item = "Widget"
    val price = 24.99
    val quantity = 3
    val total = price * quantity

    val receipt =
      s"""Receipt:
      Item: $item
      Price: $$$price
      Quantity: $quantity
      -----------------------
      Total: $$$total
      -----------------------
      Thank you for shopping with us!
      Please come again!"""

    println(receipt)
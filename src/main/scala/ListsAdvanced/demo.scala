package ListsAdvanced

@main def demo: Unit =

  val items = List("Pen", "Book", "Notebook")

  println(items.size)  // 3

  println(items.isEmpty)  // false

  println(items.contains("Book"))  // true

  println(items.contains("Pencil"))  // false

package `DataStructures`.`unit1`
/**
Introduction

Welcome, future programmer! Today, we delve into a core concept: Arrays. Imagine an array as a fleet of ships; each ship signifies an element, and together they comprise an Array. We'll explore Arrays thoroughly, learning how to form, access, and operate their attributes. Arrays in Scala are always mutable, which means their elements can be changed after the array is created. Are you stepping aboard for this expedition?
What are Arrays?

Consider a queue for a theme park ride — each person symbolizes an element of an Array, and their position in the queue corresponds to an index starting from zero. Therefore, an Array is a series of elements conveniently accessible through integer indices. Clever, isn't it?
Array Creation in Scala

In Scala, creating an Array is akin to arranging ships within a fleet. Let's organize our fleet with friends:

Scala

@main def run: Unit =

  val friends = Array("John", "Lisa", "Sam") // Our array is ready

  println(friends.mkString(", ")) // Prints the array elements: John, Lisa, Sam

Here, we've formulated an array named friends, containing three entities: "John", "Lisa", and "Sam", which we then printed using the mkString(", ") utility. mkString(", ") amalgamates an array into a single string, partitioning each item with a comma, thereby simplifying the illustration or printout of collection components in a clean format.
Accessing Array Elements in Scala

Next, let's obtain our first friend from the friends Array using an index:

Scala

@main def run: Unit =

  val friends = Array("John", "Lisa", "Sam")

  println(friends(0)) // Prints the first friend - John

It will print "John", the first (0th) element. However, exercise caution: accessing an invalid index like friends(5) will cause an error. Note that all negative numbers are also invalid indices.
Modifying Array Elements in Scala

Let's modify our array by updating an element:

Scala

@main def run: Unit =

  val friends = Array("John", "Lisa", "Sam")

  friends(1) = "Mike" // Updates the second friend from Lisa to Mike

  println(friends.mkString(", ")) // Prints: John, Mike, Sam

Using the index 1, we updated "Lisa" to "Mike". The friends array now contains "John", "Mike", and "Sam".
Properties of Arrays in Scala

Scala provides various properties and methods for arrays. To get the number of elements in an array, you can use the length property:

Scala

@main def run: Unit =

  val friends = Array("John", "Lisa", "Sam")

  println("Friends count: " + friends.length) // Prints: Friends count: 3

Our friends Array has a length of 3.

To access the last and first elements easily, you can use the last and head methods:

Scala

@main def run: Unit =

  val friends = Array("John", "Lisa", "Sam")

  println("First friend: " + friends.head) // Prints: First friend: John

  println("Last friend: " + friends.last) // Prints: Last friend: Sam

The head method retrieves the first element, and the last method retrieves the final element in the array.

The size method is similar to the length property:

Scala

@main def run: Unit =

  val friends = Array("John", "Lisa", "Sam")

  println("Friends count: " + friends.size) // Prints: Friends count: 3

To check if the array is empty, use the isEmpty method:

Scala

@main def run: Unit =

  val friends = Array[String]() // An empty array

  println("Is friends array empty? " + friends.isEmpty) // Prints: Is friends array empty? true

To verify if an array contains a specific element, use the contains method:

For additional functionalities like obtaining the range of indices or the last index, Scala allows expressions such as (0 until friends.length) to achieve a range of indices, and accessing the last index can be done with friends.length - 1.
Lesson Summary and Upcoming Practices

Congratulations! You've learned about Arrays and their properties in Scala. We have some exciting hands-on tasks coming up to challenge and reinforce these concepts. Are you ready for a stimulating task where we use arrays to decode a fascinating mystery? Prepare for some thrilling practice exercises, and I'll see you in the next lesson. Excited? Let's plunge right in!

Scala
*/

@main def run: Unit =

  val friends = Array("John", "Lisa", "Sam")

  println("Is Sam in the friends array? " + friends.contains("Sam")) // Prints: Is Sam in the friends array? true


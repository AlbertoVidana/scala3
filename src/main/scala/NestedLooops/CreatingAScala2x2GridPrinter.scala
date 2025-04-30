package NestedLooops

object GridPrinter extends App {
    val gridSize = 4
    // TODO: Add an outer loop which iterates through each row.
    // TODO: Add an inner loop which iterates through each column.
    // TODO: Print the current cell in the format "[row,col] ".
    // TODO: Print a newline character after each row.
    for (row <- 1 to gridSize) {
        for (col <- 1 to gridSize) {
            print(s"[$row,$col] ")
        }
        println()
    }
}

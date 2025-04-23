package While

/**
 * Counting Down with Scala While Loops
 * 
 * Welcome! Ready for a fun challenge? 
 * Modify the cookie baking loop to count backwards. 
 * Alter the code to print the batches from the last 
 * one to the first one, utilizing your knowledge of 
 * while loops in Scala. Good luck and happy coding!
 */

 object Main2 extends App {
    var batchesBaked = 0
    val totalBatches = 5
    while(batchesBaked < totalBatches) {
        println(s"Batch ${batchesBaked + 1} is done!")
        batchesBaked += 1
    }
}
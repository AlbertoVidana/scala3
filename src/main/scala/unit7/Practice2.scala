package unit7

@main def run: Unit = 
    val lightColor = "blue"

    lightColor match
        case "green" => println("Go!")
        case "red" => println("Stop!")
        case "yellow" => println("Slow down, prepare to stop.")
        case "blue" => println("Warning, proced with caution.")
        case _ => println("Traffic light is faulty.")
@main def run: Unit = 
    val trafficLight = "red"

    trafficLight match
        case "green" => println("Go!") // If light is green, cars can go
        case "yellow" => println("Slow down.") // If light is yellow, cars should slow down
        case "red" => println("Stop.") // If light is red, cars must stop
        case _ => println("Traffic light is malfunctioning.")
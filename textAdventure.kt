fun main() {
    var currentLocation = "dusty castle room"

    while (true) {
        when (currentLocation) {
            "dusty castle room" -> {
                println("You are in a dusty castle room. Passages lead to the north and south. What direction?")
                val direction = readln()
                if (direction == "n") {
                    currentLocation = "armory"
                } else if (direction == "s") {
                    currentLocation = "torch-lit hallway"
                }
            }
            "armory" -> {
                println("You are in the armory. There is a room off to the south. What direction?")
                val direction = readln()
                if (direction == "s") {
                    currentLocation = "dusty castle room"
                }
            }
            "torch-lit hallway" -> {
                println("You are in a torch-lit hallway. There are rooms to the east and west. What direction?")
                val direction = readln()
                if (direction == "e") {
                    currentLocation = "bedroom"
                } else if (direction == "w") {
                    currentLocation = "kitchen"
                }
            }
            "bedroom" -> {
                println("You are in a bedroom. A window overlooks the castle courtyard. A hallway is to the west. What direction?")
                val direction = readln()
                if (direction == "w") {
                    currentLocation = "torch-lit hallway"
                }
            }
            "kitchen" -> {
                println("You are in the kitchen. It looks like a roast is being made for supper. A hallway is to the east. What direction?")
                val direction = readln()
                if (direction == "w") {
                    println("Can't go that way.")
                } else if (direction == "e") {
                    currentLocation = "torch-lit hallway"
                }
            }
        }
    }
}

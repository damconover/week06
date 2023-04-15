//Damien Conover

//Current 04/15/2023

//Due 04/16/2023



fun main() {
    var currentLocation = "dusty castle room"

    while (true) {
        when (currentLocation) {
            "dusty castle room" -> {
                println("You are in a dusty castle room. Passages lead to the north and south. Which direction do you want to go?")
                val direction = readln()
                if (direction == "n") {
                    currentLocation = "armory"
                } else if (direction == "s") {
                    currentLocation = "torch-lit hallway"
                }
            }
            "armory" -> {
                println("You are in an armory. There is a room off to the south. Which direction do you want to go?")
                val direction = readln()
                if (direction == "s") {
                    currentLocation = "dusty castle room"
                }
            }
            "torch-lit hallway" -> {
                println("You are in a torch-lit hallway. There are rooms to the east and west. Which direction do you want to go?")
                val direction = readln()
                if (direction == "e") {
                    currentLocation = "bedroom"
                } else if (direction == "w") {
                    currentLocation = "kitchen"
                }
            }
            "bedroom" -> {
                println("You are in a bedroom. A window overlooks the castle courtyard. There is a hallway to the west. Which direction do you want to go?")
                val direction = readln()
                if (direction == "w") {
                    currentLocation = "torch-lit hallway"
                }
            }
            "kitchen" -> {
                println("You are in a kitchen. It looks like a roast is being made for supper. There is a hallway to the east. Which direction do you want to go?")
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

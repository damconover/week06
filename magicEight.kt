fun main() {
    println("Welcome to the Magic 8 Ball!")

    // Response
    val responses = arrayOf("Yes, of course", "Without a doubt, yes", "You can count on it",
        "For sure", "Ask me later", "I'm not sure", "I can't tell you right now, I'll tell you after my nap",
        "No way", "I don't think so", "Without a doubt, no", "The answer is clearly no")

    // Loop until quit
    while (true) {
        println("Please enter a yes/no question:")
        // Read user input
        readln()

        // Rando number
        val randomNumber = Random().nextInt(responses.size)

        // Here
        println("Magic 8 Ball says: ${responses[randomNumber]}")

        // Is the user a child?
        println("Do you want to ask another question? (y/n)")
        val continuePlaying = readln()
        if(continuePlaying == "n") {
            break
        }
    }
}

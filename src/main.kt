fun main() {
  val options = arrayOf("Rock", "Paper", "Scissors")
  val gameChoice = getGameChoice(options)
  val userChoice = getUserChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) : String {
  val index = (Math.random() * optionsParam.size).toInt()
  return optionsParam[index]
}

fun getUserChoice(optionsParam: Array<String>) : String {
  // We'll use the isValidChoice variable to indicate whether the user has entered a valid choice.
  var isValidChoice = false
  var userChoice = ""

  // Loop until the user enters a valid choice
  // Keep looping until isValidChoice is true
  while (!isValidChoice) {
    // Ask the user for their choice
    print("Please enter one of the following:")
    for (item in optionsParam) {
      print(" $item")
    }
    println(".")

    // Read the user input
    val userInput = readLine()

    // validate the user input
    if (userInput != null && userInput in optionsParam) {
      isValidChoice = true
      userChoice = userInput
    }

    // If the choice is invalid, inform the user
    if (!isValidChoice) println("You must enter a valid choice.")
  }

  return userChoice
}

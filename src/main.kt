fun main() {
  val options = arrayOf("Rock", "Paper", "Scissors")
  val gameChoice = getGameChoice(options)
  getUserChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) : String {
  val index = (Math.random() * optionsParam.size).toInt()
  return optionsParam[index]
}

fun getUserChoice(optionsParam: Array<String>) {
  // Ask the user for their choice
  println("Please enter one of the following:")
  for (item in optionsParam) {
    println("$item")
  }
  println(".")

  // Read the user input
  val userInput = readLine()
}

fun main() {
  val options = arrayOf("Rock", "Paper", "Scissors")
  val gameChoice = getGameChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) : String {
  val index = (Math.random() * optionsParam.size).toInt()
  return optionsParam[index]
}

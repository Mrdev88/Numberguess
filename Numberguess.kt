import kotlin.math.roundToInt

fun main() {
    val secretnumber = (Math.random() * 100).roundToInt()

    println("Welcome to Numberguess")
    println("© 2025 by Mahdi Ruiz")
    println("What number am I thinking of? (1-100)")
    val guess = Integer.parseInt(readlnOrNull())

    if (guess == secretnumber) {
        println("You did it!")
    } else {
        println("Better luck next time!")
    }
}
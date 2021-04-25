package core

fun main() {
    val boldLine = BoldLine()
    val width = boldLine.LINEWIDTH

    println(width)
//width is 10
}

class BoldLine {
    val LINEWIDTH = 10
}


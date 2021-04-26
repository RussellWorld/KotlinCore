package core

fun main() {
    val values = Season.values()
    values.forEach { println("${it}") }
}

enum class Season {
    Summer, Fall, Winter, Spring
}
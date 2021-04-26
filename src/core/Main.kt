package core

fun main() {
    val winter = Season.Winter
    val valuePosition = winter.ordinal
    println(valuePosition)
}

enum class Season {
    Summer, Fall, Winter, Spring
}
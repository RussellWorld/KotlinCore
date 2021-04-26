package core

fun main() {
    val winter = Season.values()[2]
    println(winter)
}

enum class Season {
    Summer, Fall, Winter, Spring
}
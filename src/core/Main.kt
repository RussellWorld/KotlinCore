package core

fun main() {
    val summer = Season.Summer
    val winter: Season = Season.Winter

    println(summer)
    println(winter)
}

enum class Season {
    Summer, Fall, Winter, Spring
}
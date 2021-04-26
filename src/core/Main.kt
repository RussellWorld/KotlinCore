package core

fun main() {
    val summer = Season.valueOf("Summer")
    println(summer)
}

enum class Season {
    Summer, Fall, Winter, Spring
}
package core

fun main() {
    val summer = Season.Summer.toString()
    //val strValue = summer.toString()
    println(summer)
}

enum class Season {
    Summer, Fall, Winter, Spring
}
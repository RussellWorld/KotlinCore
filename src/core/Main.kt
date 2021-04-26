package core

fun main() {
    //There are no Typle type in Kotlin
    val one = Pair(1, "one")
    val number1 = one.component1()
    //number is 1
    val str1 = one.component2()
    //str is "one"

    val two = Pair<Int, String>(2, "two")
    val (number2, str2) = two
    //number is 2
    //str is "two"
}


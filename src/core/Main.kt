package core

fun main() {
    val numbers = arrayOf(2, 3, 1, 7, 9)
    val numbers1 = numbers.map { i -> i * 2 + 1 }
    //numbers is 5, 7 ,3 ,15, 19

    val numbers2 = numbers.filter { it % 3 == 0 }
    //3, 9

    numbers1.forEach { print("$it ") }
    println()
    numbers2.forEach { print("$it ") }
}


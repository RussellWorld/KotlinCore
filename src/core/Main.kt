package core

import java.util.*

fun main() {
    val set = setOf(1, 2, 3)
    val set3 = set.map { it * 3 }
// 3, 6, 9
    println(set3)
}


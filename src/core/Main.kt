package core

import java.util.*

fun main() {
    val first = setOf(1, 2, 3)
    val second = setOf(3, 4, 5)

    val result1 = first.union(second)
    //{ 1, 2 , 3, 4, 5 }

    val result2 = first.subtract(second)
    //{ 1, 2 }

    val result3 = first.intersect(second)
    // { 3 }
}


package core

import java.util.*

fun main() {
    val first = setOf(1, 2)
    val second = setOf(1, 2)
    val thrid = setOf(1, 2, 3)

    val isEqual = first.equals(second)
    //True

    val isEqual1 = first == second
    //True

    val isIntersects = first.intersect(thrid).any()
    //True

    val isThirdSubsetOfFirst = first.containsAll(thrid)
    //False
}


package core

import java.util.*

fun main() {
    val chars = hashSetOf('B', 'A', 'D', 'C')
    println(chars)
    //chars A, B, C, D

    val sortedChars = sortedSetOf('B', 'H', 'D', 'A')
    println(sortedChars)
    //A, B, D, H

    val maxValue = sortedChars.max()
    //H
    println(maxValue)
    val minValue = sortedChars.min()
    //A
    println(minValue)

}


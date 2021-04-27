package core

import java.util.*

fun main() {
    val chars = setOf('A', 'B', 'C', 'D')
    val containA = chars.contains('A')
    //True

    val containE = chars.contains('E')
    //False

    val chars2 = setOf('A', 'B')
    val containAll = chars.containsAll(chars2)
    //True
}


package core

import java.util.*

fun main() {
    val chars = setOf('A', 'B', 'C', 'D')
    var str = ""

    for (c in chars) {
        if (str != "")
            str += "; "
        str += c
    }                       // A; B; C; D
    println(str)
}


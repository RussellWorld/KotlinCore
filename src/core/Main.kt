package core

import java.util.*

fun main() {
    val set = mutableSetOf("A", "B", "C")
    set.add("D")
    //A, B, C, D

    set.remove("A")
    //B, C, D

    set.clear()
    //is empty []
}


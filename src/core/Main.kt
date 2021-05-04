package core

import java.util.*


fun main() {
    var items = mutableListOf(2, 3, 5, 7, 11, 13, 17, 22, 25, 29, 32)

    println(search(items, 1))
    //print -1
    println(search(items, 32))
    //print 3
    println(search(items, 19))
    //print 3


    //   speed test
    items = Array(1000000) { 0 }.mapIndexed { i, _ -> i }.toMutableList()
    val count = 100

    val start = Date()

    for (i in 0 until count) {
        search(items, 7777777)
    }
    println()
    val milliseconds = Date().time - start.time
    println(milliseconds)

    //about 3
}

fun search(list: List<Int>, x: Int): Int {
    var i = 0
    var j = list.size
    while (i != j) {
        var m = (i + j) / 2
        if (x == list[m])
            return m
        if (x < list[m]) j = m
        else i = m + 1
    }
    return -1
}
package core

import java.util.*


fun main() {
    var items = listOf(2, 3, 5, 7, 11, 13, 17, 22, 25, 29, 32)

    println(search(items, 1))
    //print -1
    println(search(items, 7))
    //print 3
    println(search(items, 19))
    //print 3


    //   speed test
    items = Array(1000000, { 0 }).mapIndexed { i, _ -> i }
    val count = 100

    val start = Date()

    for (i in 0 until count) {
        search(items, 7777777)
    }
    println()
    val milliseconds = Date().time - start.time
    println(milliseconds)

    //about 385
}

fun search(arr: List<Int>, x: Int): Int {
    var i = 0
    val count = arr.size
    while (i < count) {
        if (arr[i] == x)
            return i
        i++
    }
    return -1
}
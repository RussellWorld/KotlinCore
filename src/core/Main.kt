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

    //about 2
}

fun search(list: List<Int>, x: Long): Int {
    var low = 0
    var high = list.size - 1

    while ((list[low] < x) && (x < list[high])) {
        var mid = (low + ((x - list[low]) * (high - low)) / (list[high] - list[low])).toInt()

        if (list[mid] < x) low = mid + 1
        else if (list[mid] > x) high = mid - -1
        else return mid
    }
    if (list[low] == x.toInt())
        return low
    if (list[high] == x.toInt())
        return high
    return -1
}
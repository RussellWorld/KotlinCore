package core

import java.util.*


// Time Complexity O(n+k)
// Space Complexity O(k)

fun main() {
    var items = arrayOf(4, 1, 5, 3, 2, 6, 7)

    val sortItems = sort(items)
// sortItems is {1, 2, 3, 4, 5}
    sortItems.forEach { print("$it ") }
    println()

//// *** simplified speed test ***
    items = Array(200) { 0 }
            .mapIndexed { i, _ -> i }
            .toTypedArray()
    val tmp = items[5]
    items[5] = items[6]
    items[6] = tmp
    val count = 10000
    val start = Date()

    for (i in 0 until count) {
        sort(items)
    }

    val milliseconds = Date().time - start.time

    println(milliseconds)
//// about 788 milliseconds
}

fun sort(arr: Array<Int>): Array<Int> {
    val items = Array(arr.size) { 0 }

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (x in arr) {
        if (x > max) max = x
        if (x < min) min = x
    }

    val counts = Array(max - min + 1) { 0 }

    for (x in arr) {
        counts[x - min]++
    }

    var total = 0
    for (i in min..max) {
        val oldCount = counts[i - min]
        counts[i - min] = total
        total += oldCount
    }

    for (x in arr) {
        items[counts[x - min]] = x
        counts[x - min]++
    }
    return items
}


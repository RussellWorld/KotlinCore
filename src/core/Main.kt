package core

import java.util.*


// Time Complexity O(n log(n))
// Space Complexity O(n)

fun main() {
    var items = arrayOf(4, 17, 15, 3, 2, 6, 7, 9, 11, 8, 14, 5, 16, 1)

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
//// about 900 milliseconds
}

fun sort(arr: Array<Int>): Array<Int> {
    var items = arr.copyOf()
    doSort(items)

    return items
}

fun doSort(items: Array<Int>) {
    if (items.size == 1)
        return

    val lLeft = items.size / 2
    var left = items.copyOfRange(0, lLeft)
    var right = items.copyOfRange(lLeft, items.size)

    doSort(left)
    doSort(right)

    return merge(left, right, items)
}

fun merge(left: Array<Int>, right: Array<Int>, result: Array<Int>) {
    var l = 0
    var r = 0
    var i = 0

    while (l < left.size && r < right.size) {
        if (left[l] < right[r]) {
            result[i] = left[l]
            l++
        } else {
            result[i] = right[r]
            r++
        }
        i++
    }
    for (j in l..left.size - 1) {
        result[i] = left[j]
        i++
    }
    for (j in r..right.size - 1) {
        result[i] = right[j]
        i++
    }
}
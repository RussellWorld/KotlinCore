package core

import java.util.*


// Time Complexity O(n^2)
// Space Complexity O(1)

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
//// about 2788 milliseconds
}

fun sort(arr: Array<Int>): Array<Int> {
    var items = arr.copyOf()
    for (i in 0..items.size - 1) {
        for (j in i + 1..items.size - 1) {
            if (items[j] < items[i]) {
                val tmp = items[j]
                items[j] = items[i]
                items[i] = tmp
            }
        }
    }
    return items
}


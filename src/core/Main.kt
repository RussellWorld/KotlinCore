package core

import java.util.*


// Time Complexity O(nk)
// Space Complexity O(n+k)

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
//// about 950 milliseconds
}

fun listToBuckets(items: Array<Int>, cBase: Int, i: Int): Array<MutableList<Int>> {
    val buckets = Array(cBase, { mutableListOf<Int>() })

    val pBase = Math.pow(cBase.toDouble(), i.toDouble()).toInt()
    for (x in items) {
        //Isolate the base-digit from the number
        val digit = (x / pBase) % cBase
        //Drop the number into the correct bucket
        buckets[digit].add(x)
    }
    return buckets
}

fun bucketsToList(buckets: Array<MutableList<Int>>): Array<Int> {
    val result = mutableListOf<Int>()

    for (bucket in buckets) {
        //add the numbers in a bucket
        //sequentially to the returned array
        result.addAll(bucket)
    }
    return result.toTypedArray()
}

fun sort(array: Array<Int>, cBase: Int = 10): Array<Int> {
    var result = array.copyOf()
    val maxVal = array.max()!!
    var i = 0

    while (Math.pow(cBase.toDouble(), i.toDouble()) <= maxVal) {
        result = bucketsToList(listToBuckets(result, cBase, i))
        i++
    }
    return result
}
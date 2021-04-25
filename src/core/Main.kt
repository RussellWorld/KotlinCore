package core

fun main() {
    val ar = arrayOf(2, 3, 6, 7)
    val (first, last) = getFirstLast(ar)
    //first is 2
    //last is 7
    println("first = $first, last = $last")
}

fun getFirstLast(ar: Array<Int>): Pair<Int, Int> {
    var first = -1
    var last = -1

    if (ar.isNotEmpty()) {   //ar.size > 0
        first = ar[0]
        last = ar[ar.size - 1]
    }
    return Pair(first, last)
}


package core

fun main() {
    val dic = mapOf(
            3 to "three", 1 to "one", 2 to "two"
    )
    val sortedDic = dic.toSortedMap()
    println(sortedDic)
}


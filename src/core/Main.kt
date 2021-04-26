package core

fun main() {
    val dic = mapOf(
            1 to "A", 2 to "B", 3 to "A"
    )
    val value = "A"

    val keys = dic.toList()
            .filter { (_, v) -> v == value }
            .toMap().keys
    //keys is [1, 3]
}


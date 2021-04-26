package core

fun main() {
    val dic = mapOf(
            3 to "B", 2 to "A", 1 to "C"
    )
    val sortedDic = dic.toList()
            .sortedBy { (_, value) -> value }
            .toMap()
    //sortedDic is {2=A, 3=B, 1=C}

    println(sortedDic)
}


package core

fun main() {
    val dic = mapOf(
            3 to "B", 2 to "A", 1 to "C"
    )
    val oddDic = dic.toList()
            .filter { (k, _) -> k % 2 == 1 }
            .toMap()
    //oddDic is {3=B, 1=C}

    println(oddDic)
}


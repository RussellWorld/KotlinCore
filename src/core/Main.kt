package core

fun main() {
    val dic = mapOf(
            3 to "B", 2 to "A", 1 to "C"
    )
    val sortedDic = dic.toList()
            .sortedBy { (key, _) -> key }
            .toMap()
    //sortedDic is {1=C, 2=A, 3=B}

    println(sortedDic)
}


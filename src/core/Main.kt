package core

fun main() {
    val dic = mapOf(
            1 to "one", 2 to null
    )
    val upperDic = dic
            .mapValues { it.value?.toUpperCase() }

    println(upperDic)
}


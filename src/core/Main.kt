package core

fun main() {
    val dic = mapOf(
            1 to "one", 2 to null
    )
    val exists1 = dic.containsKey(1) //true
    val exists2 = dic.containsKey(2) //true
    val exists3 = dic.containsKey(3) //false

    println(exists1)
    println(exists2)
    println(exists3)
}


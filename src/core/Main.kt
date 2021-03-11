package core

fun main(args: Array<String>) {
    val data1 = "aaab"
    val data2 = "aaaaabb"
    val regex = "a+b".toRegex()
    val b1 = regex.matches(data1)
    val b2 = regex.matches(data2)

    println(b1)
    println(b2)
}


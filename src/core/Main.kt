package core

fun main(args: Array<String>) {
    println(findMind(1, 3))
    println(findMind(4, 2, true))
    println(findMind(5, 3))
}

fun findMind(n1: Int, n2: Int, absolute: Boolean = false): Int {
    val v1: Int
    val v2: Int
    if (absolute) {
        v1 = Math.abs(n1)
        v2 = Math.abs(n2)
    } else {
        v1 = n1
        v2 = n2
    }
    return if (v1 < v2) n1 else n2
}


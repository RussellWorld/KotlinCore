package core

fun main(args: Array<String>) {
    printPrefix("one", "two", "three", "four", "five", prefix = "number: ")
}

fun printPrefix(vararg words: String, prefix: String) {
    for (m in words)
        println(prefix + m)
}


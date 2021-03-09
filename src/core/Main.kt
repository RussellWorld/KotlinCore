package core

fun main(args: Array<String>) {
    print(sum(1, 4))
}

fun sum(a: Int, b: Int, c: Int = 0, d: Int = 0) = a + b + c + d

package core

fun main(args: Array<String>) {
    val a = 10
    val b = 3
    val c = 5

    val result = mult(a, b, c)
    print("Multuply: $result")

}

fun mult(a: Int, b: Int, c: Int) = (a * b * c)

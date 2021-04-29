package core

fun main() {
    val sumFunc = makeSum()
    val sum = sumFunc(5, 8)
    //sum is 13

    println(sum)
}

fun makeSum(): (Int, Int) -> Int {
    return { a, b -> a + b }
}


package core

fun main() {
    val sum = getSum(5, 3)
    //sum is 8
    println("sum = $sum")
}

fun getSum(n1: Int, n2: Int): Int {
    return n1 + n2
}


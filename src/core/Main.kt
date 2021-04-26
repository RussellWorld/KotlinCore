package core

fun main() {
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17)
    var sum = 0
    for (it in numbers) {     //numbers.forEach {sum += it}
        sum += it
    }
    //sum is 58
    println(sum)

    var mult = 1
    listOf(2, 3, 4, 5).forEach(fun(value: Int) { mult *= value })
    //mult is 120
    println(mult)

}


package core

fun main() {
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17, 19)
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    //sum is 77
    println(sum)

    for ((i, number) in numbers.withIndex()) {
        println("numbers[$i] is $number")
    }

}


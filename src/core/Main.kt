package core


fun main() {
    val numbers = arrayOf(2, 3, 5, 7, 11)
    val first2 = numbers.copyOf(2)
    //2,3
    val last3 = numbers.copyOfRange(2, 5)
    //last3 is 5,7,11

    first2.forEach { print("$it ") }
    println()
    last3.forEach { print("$it ") }
}






package core


fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    var oddItems = numbers.filter { i -> i % 2 == 1 }
    //oddItems 1, 3, 5
    println(oddItems)
}






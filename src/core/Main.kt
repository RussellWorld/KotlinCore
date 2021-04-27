package core


fun main() {
    val numbers = arrayOf(2, 3, 5, 7, 11, 13, 17)
    var contain5 = numbers.contains(5)
    //True

    val index5 = numbers.indexOf(5)
    //is 2

    val contain10 = numbers.contains(10)
    //is False

    println(contain5)
    println(index5)
    println(contain10)

}






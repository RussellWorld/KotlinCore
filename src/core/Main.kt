package core


fun main() {
    val data1 = "aaab"
    val data2 = "aaaba"
    val regex = "a+b".toRegex()
    val b1 = regex.matches(data1)
    //b1 is true

    val b2 = regex.matches(data2)
    //b2 is false

    println(b1)
    println(b2)
}

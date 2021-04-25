package core

fun main() {

    val size = Size(4, 5)
    val area = size.area
    //size is 20

    println(area)
}

class Size(var wight: Int, var height: Int)

val Size.area: Int
    get() = this.height * this.wight


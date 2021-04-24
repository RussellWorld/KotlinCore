package core

import kotlin.math.sqrt

class Square(var side: Double) {
    var area: Double
        get() = side * side
        set(value) {
            side = sqrt(value)
        }
}

fun main() {
    val square = Square(2.0)
    //square.area is 4.0
    println(square.area)

    square.area = 9.0
    //square.side is 3.0
}

package core

open class Shape {
    protected var lineCount: Int = 0
}

class Square : Shape() {
    init {
        lineCount = 4
    }
}

fun main() {
    val square = Square(5)
    var lineCount = square.lineCount // <= Error
}

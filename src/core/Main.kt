package core

//first method
abstract class Shape(var lineCount: Int)

class Square(var sideLength: Int) : Shape(4)

//second method
abstract class Shape {
    public var lineCount: Int

    constructor(lineCount: Int) {
        this.lineCount = lineCount
    }
}

class Square : Shape {
    var sideLength: Int

    constructor(sideLength: Int) : super(4) {
        this.sideLength = sideLength
    }
}

fun main() {
    val square = Square(4)
    //square.lineCount is 4

}
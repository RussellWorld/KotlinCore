package core


open class Shape {
    open fun getArea(): Int {
        return 0
    }
}

class Square(var sideLength: Int) : Shape() {
    override fun getArea(): Int {
        return sideLength * sideLength
    }
}

fun main() {
    var square = Square(5)
    var area = square.getArea()
    //area is 25
}

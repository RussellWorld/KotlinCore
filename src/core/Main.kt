package core

open class Shape {
    open fun getArea(): Int {
        return 0
    }
}

open class Square(var sideLength: Int) : Shape() {
    override fun getArea(): Int {
        return sideLength * sideLength
    }
}


open class RedSquare(var sideLength: Int) : Square(sideLength) {
    override fun getArea(): Int { //<= Error
    }
}
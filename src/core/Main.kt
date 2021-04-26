package core

fun main() {
    var p = Point(1, 1)
    p++
    //p.x is 2 and p.y is 2
    println("(${p.x}, ${p.y})")
    ++p
    //p.x is 3 and p.y is 3
    println("(${p.x}, ${p.y})")
    p = -p
    //p.x is -3 and p.y is -3
    println("(${p.x}, ${p.y})")
}

class Point(var x: Int, var y: Int) {
    operator fun inc(): Point {
        return Point(++x, ++y)
    }

    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }
}
package core

class Point1(var x: Int, var y: Int)

class Point2() {
    var x: Double = 0.0
    var y: Double = 0.0
}

fun main() {
    val point1 = Point1(2, 5)
    val point2 = Point2()
    //x and y is 0.0 (before assigning)
    point2.x = 3.0
    point2.y = 7.0

    println(point1.y)
    println(point2.x)
}
